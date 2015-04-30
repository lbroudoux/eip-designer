package com.github.lbroudoux.dsl.eip.parser.spring;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * @author laurent
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.github.lbroudoux.dsl.eip.parser.spring"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	/**
	* @return the id of the EIP Spring ui plugin
	*/
	public static String getPluginId() {
	   return getDefault().getBundle().getSymbolicName();
	}
	
	/**
	* Handle an error. The error is logged. If <code>show</code> is
	* <code>true</code> the error is shown to the user.
	* @param message a localized message
	* @param throwable
	* @param show
	*/
	public static void handleError(String message, Throwable throwable, boolean show) {
	   IStatus status = new Status(IStatus.ERROR, getPluginId(), message, throwable);
	   int style = StatusManager.LOG;
	   if (show) {
	      style |= StatusManager.SHOW;
	   }
	   StatusManager.getManager().handle(status, style);
	}
}
