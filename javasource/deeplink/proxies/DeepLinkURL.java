// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package deeplink.proxies;

public class DeepLinkURL
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject deepLinkURLMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DeepLink.DeepLinkURL";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		URL("URL"),
		Path("Path"),
		QueryString("QueryString"),
		DeepLinkURL_DeepLink("DeepLink.DeepLinkURL_DeepLink");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public DeepLinkURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected DeepLinkURL(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject deepLinkURLMendixObject)
	{
		if (deepLinkURLMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, deepLinkURLMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.deepLinkURLMendixObject = deepLinkURLMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'DeepLinkURL.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static deeplink.proxies.DeepLinkURL initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return deeplink.proxies.DeepLinkURL.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static deeplink.proxies.DeepLinkURL initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new deeplink.proxies.DeepLinkURL(context, mendixObject);
	}

	public static deeplink.proxies.DeepLinkURL load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return deeplink.proxies.DeepLinkURL.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of URL
	 */
	public final java.lang.String getURL()
	{
		return getURL(getContext());
	}

	/**
	 * @param context
	 * @return value of URL
	 */
	public final java.lang.String getURL(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.URL.toString());
	}

	/**
	 * Set value of URL
	 * @param url
	 */
	public final void setURL(java.lang.String url)
	{
		setURL(getContext(), url);
	}

	/**
	 * Set value of URL
	 * @param context
	 * @param url
	 */
	public final void setURL(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String url)
	{
		getMendixObject().setValue(context, MemberNames.URL.toString(), url);
	}

	/**
	 * @return value of Path
	 */
	public final java.lang.String getPath()
	{
		return getPath(getContext());
	}

	/**
	 * @param context
	 * @return value of Path
	 */
	public final java.lang.String getPath(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Path.toString());
	}

	/**
	 * Set value of Path
	 * @param path
	 */
	public final void setPath(java.lang.String path)
	{
		setPath(getContext(), path);
	}

	/**
	 * Set value of Path
	 * @param context
	 * @param path
	 */
	public final void setPath(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String path)
	{
		getMendixObject().setValue(context, MemberNames.Path.toString(), path);
	}

	/**
	 * @return value of QueryString
	 */
	public final java.lang.String getQueryString()
	{
		return getQueryString(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryString
	 */
	public final java.lang.String getQueryString(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueryString.toString());
	}

	/**
	 * Set value of QueryString
	 * @param querystring
	 */
	public final void setQueryString(java.lang.String querystring)
	{
		setQueryString(getContext(), querystring);
	}

	/**
	 * Set value of QueryString
	 * @param context
	 * @param querystring
	 */
	public final void setQueryString(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String querystring)
	{
		getMendixObject().setValue(context, MemberNames.QueryString.toString(), querystring);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DeepLinkURL_DeepLink
	 */
	public final deeplink.proxies.DeepLink getDeepLinkURL_DeepLink() throws com.mendix.core.CoreException
	{
		return getDeepLinkURL_DeepLink(getContext());
	}

	/**
	 * @param context
	 * @return value of DeepLinkURL_DeepLink
	 * @throws com.mendix.core.CoreException
	 */
	public final deeplink.proxies.DeepLink getDeepLinkURL_DeepLink(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		deeplink.proxies.DeepLink result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DeepLinkURL_DeepLink.toString());
		if (identifier != null) {
			result = deeplink.proxies.DeepLink.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DeepLinkURL_DeepLink
	 * @param deeplinkurl_deeplink
	 */
	public final void setDeepLinkURL_DeepLink(deeplink.proxies.DeepLink deeplinkurl_deeplink)
	{
		setDeepLinkURL_DeepLink(getContext(), deeplinkurl_deeplink);
	}

	/**
	 * Set value of DeepLinkURL_DeepLink
	 * @param context
	 * @param deeplinkurl_deeplink
	 */
	public final void setDeepLinkURL_DeepLink(com.mendix.systemwideinterfaces.core.IContext context, deeplink.proxies.DeepLink deeplinkurl_deeplink)
	{
		if (deeplinkurl_deeplink == null) {
			getMendixObject().setValue(context, MemberNames.DeepLinkURL_DeepLink.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DeepLinkURL_DeepLink.toString(), deeplinkurl_deeplink.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return deepLinkURLMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final deeplink.proxies.DeepLinkURL that = (deeplink.proxies.DeepLinkURL) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
