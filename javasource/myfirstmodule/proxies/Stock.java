// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Stock
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject stockMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Stock";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Ticker("Ticker"),
		Description("Description"),
		Exchange("Exchange"),
		Sector("Sector"),
		Country("Country"),
		BuyPrice("BuyPrice"),
		SellPrice("SellPrice"),
		Amount("Amount"),
		Profit("Profit"),
		Address("Address"),
		Stock_SumProfit("MyFirstModule.Stock_SumProfit"),
		Stock_Account("MyFirstModule.Stock_Account");

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

	public Stock(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Stock(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject stockMendixObject)
	{
		if (stockMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, stockMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.stockMendixObject = stockMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Stock.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Stock initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Stock.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Stock initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Stock(context, mendixObject);
	}

	public static myfirstmodule.proxies.Stock load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Stock.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Stock> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Stock.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Ticker
	 */
	public final java.lang.String getTicker()
	{
		return getTicker(getContext());
	}

	/**
	 * @param context
	 * @return value of Ticker
	 */
	public final java.lang.String getTicker(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Ticker.toString());
	}

	/**
	 * Set value of Ticker
	 * @param ticker
	 */
	public final void setTicker(java.lang.String ticker)
	{
		setTicker(getContext(), ticker);
	}

	/**
	 * Set value of Ticker
	 * @param context
	 * @param ticker
	 */
	public final void setTicker(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String ticker)
	{
		getMendixObject().setValue(context, MemberNames.Ticker.toString(), ticker);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Exchange
	 */
	public final java.lang.String getExchange()
	{
		return getExchange(getContext());
	}

	/**
	 * @param context
	 * @return value of Exchange
	 */
	public final java.lang.String getExchange(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Exchange.toString());
	}

	/**
	 * Set value of Exchange
	 * @param exchange
	 */
	public final void setExchange(java.lang.String exchange)
	{
		setExchange(getContext(), exchange);
	}

	/**
	 * Set value of Exchange
	 * @param context
	 * @param exchange
	 */
	public final void setExchange(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String exchange)
	{
		getMendixObject().setValue(context, MemberNames.Exchange.toString(), exchange);
	}

	/**
	 * @return value of Sector
	 */
	public final java.lang.String getSector()
	{
		return getSector(getContext());
	}

	/**
	 * @param context
	 * @return value of Sector
	 */
	public final java.lang.String getSector(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Sector.toString());
	}

	/**
	 * Set value of Sector
	 * @param sector
	 */
	public final void setSector(java.lang.String sector)
	{
		setSector(getContext(), sector);
	}

	/**
	 * Set value of Sector
	 * @param context
	 * @param sector
	 */
	public final void setSector(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sector)
	{
		getMendixObject().setValue(context, MemberNames.Sector.toString(), sector);
	}

	/**
	 * @return value of Country
	 */
	public final java.lang.String getCountry()
	{
		return getCountry(getContext());
	}

	/**
	 * @param context
	 * @return value of Country
	 */
	public final java.lang.String getCountry(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Country.toString());
	}

	/**
	 * Set value of Country
	 * @param country
	 */
	public final void setCountry(java.lang.String country)
	{
		setCountry(getContext(), country);
	}

	/**
	 * Set value of Country
	 * @param context
	 * @param country
	 */
	public final void setCountry(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String country)
	{
		getMendixObject().setValue(context, MemberNames.Country.toString(), country);
	}

	/**
	 * @return value of BuyPrice
	 */
	public final java.math.BigDecimal getBuyPrice()
	{
		return getBuyPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of BuyPrice
	 */
	public final java.math.BigDecimal getBuyPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.BuyPrice.toString());
	}

	/**
	 * Set value of BuyPrice
	 * @param buyprice
	 */
	public final void setBuyPrice(java.math.BigDecimal buyprice)
	{
		setBuyPrice(getContext(), buyprice);
	}

	/**
	 * Set value of BuyPrice
	 * @param context
	 * @param buyprice
	 */
	public final void setBuyPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal buyprice)
	{
		getMendixObject().setValue(context, MemberNames.BuyPrice.toString(), buyprice);
	}

	/**
	 * @return value of SellPrice
	 */
	public final java.math.BigDecimal getSellPrice()
	{
		return getSellPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of SellPrice
	 */
	public final java.math.BigDecimal getSellPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.SellPrice.toString());
	}

	/**
	 * Set value of SellPrice
	 * @param sellprice
	 */
	public final void setSellPrice(java.math.BigDecimal sellprice)
	{
		setSellPrice(getContext(), sellprice);
	}

	/**
	 * Set value of SellPrice
	 * @param context
	 * @param sellprice
	 */
	public final void setSellPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal sellprice)
	{
		getMendixObject().setValue(context, MemberNames.SellPrice.toString(), sellprice);
	}

	/**
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount()
	{
		return getAmount(getContext());
	}

	/**
	 * @param context
	 * @return value of Amount
	 */
	public final java.lang.Integer getAmount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Amount.toString());
	}

	/**
	 * Set value of Amount
	 * @param amount
	 */
	public final void setAmount(java.lang.Integer amount)
	{
		setAmount(getContext(), amount);
	}

	/**
	 * Set value of Amount
	 * @param context
	 * @param amount
	 */
	public final void setAmount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer amount)
	{
		getMendixObject().setValue(context, MemberNames.Amount.toString(), amount);
	}

	/**
	 * @return value of Profit
	 */
	public final java.math.BigDecimal getProfit()
	{
		return getProfit(getContext());
	}

	/**
	 * @param context
	 * @return value of Profit
	 */
	public final java.math.BigDecimal getProfit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Profit.toString());
	}

	/**
	 * Set value of Profit
	 * @param profit
	 */
	public final void setProfit(java.math.BigDecimal profit)
	{
		setProfit(getContext(), profit);
	}

	/**
	 * Set value of Profit
	 * @param context
	 * @param profit
	 */
	public final void setProfit(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal profit)
	{
		getMendixObject().setValue(context, MemberNames.Profit.toString(), profit);
	}

	/**
	 * @return value of Address
	 */
	public final java.lang.String getAddress()
	{
		return getAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of Address
	 */
	public final java.lang.String getAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Address.toString());
	}

	/**
	 * Set value of Address
	 * @param address
	 */
	public final void setAddress(java.lang.String address)
	{
		setAddress(getContext(), address);
	}

	/**
	 * Set value of Address
	 * @param context
	 * @param address
	 */
	public final void setAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String address)
	{
		getMendixObject().setValue(context, MemberNames.Address.toString(), address);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Stock_SumProfit
	 */
	public final myfirstmodule.proxies.SumProfit getStock_SumProfit() throws com.mendix.core.CoreException
	{
		return getStock_SumProfit(getContext());
	}

	/**
	 * @param context
	 * @return value of Stock_SumProfit
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.SumProfit getStock_SumProfit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.SumProfit result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Stock_SumProfit.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.SumProfit.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Stock_SumProfit
	 * @param stock_sumprofit
	 */
	public final void setStock_SumProfit(myfirstmodule.proxies.SumProfit stock_sumprofit)
	{
		setStock_SumProfit(getContext(), stock_sumprofit);
	}

	/**
	 * Set value of Stock_SumProfit
	 * @param context
	 * @param stock_sumprofit
	 */
	public final void setStock_SumProfit(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.SumProfit stock_sumprofit)
	{
		if (stock_sumprofit == null) {
			getMendixObject().setValue(context, MemberNames.Stock_SumProfit.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Stock_SumProfit.toString(), stock_sumprofit.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Stock_Account
	 */
	public final administration.proxies.Account getStock_Account() throws com.mendix.core.CoreException
	{
		return getStock_Account(getContext());
	}

	/**
	 * @param context
	 * @return value of Stock_Account
	 * @throws com.mendix.core.CoreException
	 */
	public final administration.proxies.Account getStock_Account(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		administration.proxies.Account result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Stock_Account.toString());
		if (identifier != null) {
			result = administration.proxies.Account.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Stock_Account
	 * @param stock_account
	 */
	public final void setStock_Account(administration.proxies.Account stock_account)
	{
		setStock_Account(getContext(), stock_account);
	}

	/**
	 * Set value of Stock_Account
	 * @param context
	 * @param stock_account
	 */
	public final void setStock_Account(com.mendix.systemwideinterfaces.core.IContext context, administration.proxies.Account stock_account)
	{
		if (stock_account == null) {
			getMendixObject().setValue(context, MemberNames.Stock_Account.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Stock_Account.toString(), stock_account.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return stockMendixObject;
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
			final myfirstmodule.proxies.Stock that = (myfirstmodule.proxies.Stock) obj;
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
