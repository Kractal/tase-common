/**
 * 
 */
package com.softsec.tase.common.dto.app.apk;

import java.io.Serializable;

/**
 * ApkLibrary
 * <p> </p>
 * @author yanwei
 * @since 2013-5-8 下午2:47:44
 * @version
 */
public class ApkUsesLibrary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4736857092381288546L;

	/**
	 * Specifies a shared library that the application must be linked against. 
	 * This element tells the system to include the library's code in the class loader for the package.
	 * 
	 * All of the android packages (such as android.app, android.content, android.view, and android.widget) 
	 * are in the default library that all applications are automatically linked against. 
	 * However, some packages (such as maps) are in separate libraries that are not automatically linked. 
	 * Consult the documentation for the packages you're using to determine which library contains the package code.
	 * This element also affects the installation of the application on a particular device 
	 * and the availability of the application on Google Play:
	 * Installation
	 * If this element is present and its android:required attribute is set to true, 
	 * the PackageManager framework won't let the user install the application 
	 * unless the library is present on the user's device.
	 * The android:required attribute is described in detail in the following section.
	 */
	private String libraryName;
		
	private boolean required;
	
	public ApkUsesLibrary() {
	}
	
	public ApkUsesLibrary(String libraryName) {
		this.libraryName = libraryName;
	}
	
	public ApkUsesLibrary(String libraryName, boolean required) {
		this.libraryName = libraryName;
		this.required = required;
	}

	/**
	 * @return the libraryName
	 */
	public String getLibraryName() {
		return libraryName;
	}

	/**
	 * @param libraryName the libraryName to set
	 */
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	/**
	 * @return the required
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * @param required the required to set
	 */
	public void setRequired(boolean required) {
		this.required = required;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ApkUsesLibrary [libraryName=" + libraryName + ", required="
				+ required + "]";
	}
}
