// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package xlsreport.proxies;

public class MxColumn extends xlsreport.proxies.MxData
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "XLSReport.MxColumn";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ColumnNumber("ColumnNumber"),
		ObjectAttribute("ObjectAttribute"),
		DataAggregate("DataAggregate"),
		DataAggregateFunction("DataAggregateFunction"),
		ResultAggregate("ResultAggregate"),
		ResultAggregateFunction("ResultAggregateFunction"),
		Name("Name"),
		Status("Status"),
		MxData_MxSheet("XLSReport.MxData_MxSheet"),
		MxData_MxCellStyle("XLSReport.MxData_MxCellStyle"),
		MxXPath_MxData("XLSReport.MxXPath_MxData");

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

	public MxColumn(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected MxColumn(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mxColumnMendixObject)
	{
		super(context, mxColumnMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, mxColumnMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'MxColumn.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static xlsreport.proxies.MxColumn initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return xlsreport.proxies.MxColumn.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static xlsreport.proxies.MxColumn initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new xlsreport.proxies.MxColumn(context, mendixObject);
	}

	public static xlsreport.proxies.MxColumn load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return xlsreport.proxies.MxColumn.initialize(context, mendixObject);
	}

	public static java.util.List<xlsreport.proxies.MxColumn> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> xlsreport.proxies.MxColumn.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of ColumnNumber
	 */
	public final java.lang.Integer getColumnNumber()
	{
		return getColumnNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of ColumnNumber
	 */
	public final java.lang.Integer getColumnNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.ColumnNumber.toString());
	}

	/**
	 * Set value of ColumnNumber
	 * @param columnnumber
	 */
	public final void setColumnNumber(java.lang.Integer columnnumber)
	{
		setColumnNumber(getContext(), columnnumber);
	}

	/**
	 * Set value of ColumnNumber
	 * @param context
	 * @param columnnumber
	 */
	public final void setColumnNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer columnnumber)
	{
		getMendixObject().setValue(context, MemberNames.ColumnNumber.toString(), columnnumber);
	}

	/**
	 * @return value of ObjectAttribute
	 */
	public final java.lang.String getObjectAttribute()
	{
		return getObjectAttribute(getContext());
	}

	/**
	 * @param context
	 * @return value of ObjectAttribute
	 */
	public final java.lang.String getObjectAttribute(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ObjectAttribute.toString());
	}

	/**
	 * Set value of ObjectAttribute
	 * @param objectattribute
	 */
	public final void setObjectAttribute(java.lang.String objectattribute)
	{
		setObjectAttribute(getContext(), objectattribute);
	}

	/**
	 * Set value of ObjectAttribute
	 * @param context
	 * @param objectattribute
	 */
	public final void setObjectAttribute(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String objectattribute)
	{
		getMendixObject().setValue(context, MemberNames.ObjectAttribute.toString(), objectattribute);
	}

	/**
	 * @return value of DataAggregate
	 */
	public final java.lang.Boolean getDataAggregate()
	{
		return getDataAggregate(getContext());
	}

	/**
	 * @param context
	 * @return value of DataAggregate
	 */
	public final java.lang.Boolean getDataAggregate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.DataAggregate.toString());
	}

	/**
	 * Set value of DataAggregate
	 * @param dataaggregate
	 */
	public final void setDataAggregate(java.lang.Boolean dataaggregate)
	{
		setDataAggregate(getContext(), dataaggregate);
	}

	/**
	 * Set value of DataAggregate
	 * @param context
	 * @param dataaggregate
	 */
	public final void setDataAggregate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean dataaggregate)
	{
		getMendixObject().setValue(context, MemberNames.DataAggregate.toString(), dataaggregate);
	}

	/**
	 * Set value of DataAggregateFunction
	 * @param dataaggregatefunction
	 */
	public final xlsreport.proxies.AggregateFunction getDataAggregateFunction()
	{
		return getDataAggregateFunction(getContext());
	}

	/**
	 * @param context
	 * @return value of DataAggregateFunction
	 */
	public final xlsreport.proxies.AggregateFunction getDataAggregateFunction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DataAggregateFunction.toString());
		if (obj == null) {
			return null;
		}
		return xlsreport.proxies.AggregateFunction.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DataAggregateFunction
	 * @param dataaggregatefunction
	 */
	public final void setDataAggregateFunction(xlsreport.proxies.AggregateFunction dataaggregatefunction)
	{
		setDataAggregateFunction(getContext(), dataaggregatefunction);
	}

	/**
	 * Set value of DataAggregateFunction
	 * @param context
	 * @param dataaggregatefunction
	 */
	public final void setDataAggregateFunction(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.AggregateFunction dataaggregatefunction)
	{
		if (dataaggregatefunction != null) {
			getMendixObject().setValue(context, MemberNames.DataAggregateFunction.toString(), dataaggregatefunction.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.DataAggregateFunction.toString(), null);
		}
	}

	/**
	 * @return value of ResultAggregate
	 */
	public final java.lang.Boolean getResultAggregate()
	{
		return getResultAggregate(getContext());
	}

	/**
	 * @param context
	 * @return value of ResultAggregate
	 */
	public final java.lang.Boolean getResultAggregate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ResultAggregate.toString());
	}

	/**
	 * Set value of ResultAggregate
	 * @param resultaggregate
	 */
	public final void setResultAggregate(java.lang.Boolean resultaggregate)
	{
		setResultAggregate(getContext(), resultaggregate);
	}

	/**
	 * Set value of ResultAggregate
	 * @param context
	 * @param resultaggregate
	 */
	public final void setResultAggregate(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean resultaggregate)
	{
		getMendixObject().setValue(context, MemberNames.ResultAggregate.toString(), resultaggregate);
	}

	/**
	 * Set value of ResultAggregateFunction
	 * @param resultaggregatefunction
	 */
	public final xlsreport.proxies.AggregateFunction getResultAggregateFunction()
	{
		return getResultAggregateFunction(getContext());
	}

	/**
	 * @param context
	 * @return value of ResultAggregateFunction
	 */
	public final xlsreport.proxies.AggregateFunction getResultAggregateFunction(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ResultAggregateFunction.toString());
		if (obj == null) {
			return null;
		}
		return xlsreport.proxies.AggregateFunction.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ResultAggregateFunction
	 * @param resultaggregatefunction
	 */
	public final void setResultAggregateFunction(xlsreport.proxies.AggregateFunction resultaggregatefunction)
	{
		setResultAggregateFunction(getContext(), resultaggregatefunction);
	}

	/**
	 * Set value of ResultAggregateFunction
	 * @param context
	 * @param resultaggregatefunction
	 */
	public final void setResultAggregateFunction(com.mendix.systemwideinterfaces.core.IContext context, xlsreport.proxies.AggregateFunction resultaggregatefunction)
	{
		if (resultaggregatefunction != null) {
			getMendixObject().setValue(context, MemberNames.ResultAggregateFunction.toString(), resultaggregatefunction.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.ResultAggregateFunction.toString(), null);
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final xlsreport.proxies.MxColumn that = (xlsreport.proxies.MxColumn) obj;
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
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
