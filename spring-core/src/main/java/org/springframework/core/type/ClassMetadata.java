/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core.type;

import org.springframework.lang.Nullable;

/**
 * Interface that defines abstract metadata of a specific class,
 * in a form that does not require that class to be loaded yet.
 *
 * @author Juergen Hoeller
 * @since 2.5
 * @see StandardClassMetadata
 * @see org.springframework.core.type.classreading.MetadataReader#getClassMetadata()
 * @see AnnotationMetadata
 */
public interface ClassMetadata {

	/**
	 * 返回类名称(底层原始类名,带包路径名称)
	 * Return the name of the underlying class.
	 */
	String getClassName();

	/**
	 * 是否是接口
	 * Return whether the underlying class represents an interface.
	 */
	boolean isInterface();

	/**
	 * 是否是个注解
	 * Return whether the underlying class represents an annotation.
	 * @since 4.1
	 */
	boolean isAnnotation();

	/**
	 * 是否是抽象类
	 * Return whether the underlying class is marked as abstract.
	 */
	boolean isAbstract();

	/**
	 * 是否可以被创建,不是接口且不是抽象类就返回true了
	 * Return whether the underlying class represents a concrete class,
	 * i.e. neither an interface nor an abstract class.
	 */
	default boolean isConcrete() {
		return !(isInterface() || isAbstract());
	}

	/**
	 * 是否被final修饰的
	 * Return whether the underlying class is marked as 'final'.
	 */
	boolean isFinal();

	/**
	 * 是否是独立的类(可以单独创建的，顶层类或者静态内部类)
	 * Determine whether the underlying class is independent, i.e. whether
	 * it is a top-level class or a nested class (static inner class) that
	 * can be constructed independently from an enclosing class.
	 */
	boolean isIndependent();

	/**
	 * 是否存在封闭类(顶层类则返回false,内部类则为true)
	 * Return whether the underlying class is declared within an enclosing
	 * class (i.e. the underlying class is an inner/nested class or a
	 * local class within a method).
	 * <p>If this method returns {@code false}, then the underlying
	 * class is a top-level class.
	 */
	default boolean hasEnclosingClass() {
		return (getEnclosingClassName() != null);
	}

	/**
	 * 返回该类的封闭类，顶层类返回null,内部类则返回最近包装他的类
	 * Return the name of the enclosing class of the underlying class,
	 * or {@code null} if the underlying class is a top-level class.
	 */
	@Nullable
	String getEnclosingClassName();

	/**
	 * 是否有父类
	 * Return whether the underlying class has a super class.
	 */
	default boolean hasSuperClass() {
		return (getSuperClassName() != null);
	}

	/**
	 * 获取父类名称(包含包名)
	 * Return the name of the super class of the underlying class,
	 * or {@code null} if there is no super class defined.
	 */
	@Nullable
	String getSuperClassName();

	/**
	 * 获取实现接口的名称
	 * Return the names of all interfaces that the underlying class
	 * implements, or an empty array if there are none.
	 */
	String[] getInterfaceNames();

	/**
	 *
	 * 获取类内部中定义的类的类名称
	 * Return the names of all classes declared as members of the class represented by
	 * this ClassMetadata object. This includes public, protected, default (package)
	 * access, and private classes and interfaces declared by the class, but excludes
	 * inherited classes and interfaces. An empty array is returned if no member classes
	 * or interfaces exist.
	 * @since 3.1
	 */
	String[] getMemberClassNames();

}
