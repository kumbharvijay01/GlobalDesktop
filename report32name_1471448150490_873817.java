/*
 * Generated by JasperReports - 8/17/16 9:05 PM
 */
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.fill.*;

import java.util.*;
import java.math.*;
import java.text.*;
import java.io.*;
import java.net.*;



/**
 *
 */
public class report32name_1471448150490_873817 extends JREvaluator
{


    /**
     *
     */
    private JRFillParameter parameter_IS_IGNORE_PAGINATION = null;
    private JRFillParameter parameter_REPORT_CONNECTION = null;
    private JRFillParameter parameter_FILTER = null;
    private JRFillParameter parameter_JASPER_REPORT = null;
    private JRFillParameter parameter_REPORT_LOCALE = null;
    private JRFillParameter parameter_REPORT_TIME_ZONE = null;
    private JRFillParameter parameter_REPORT_TEMPLATES = null;
    private JRFillParameter parameter_REPORT_MAX_COUNT = null;
    private JRFillParameter parameter_REPORT_SCRIPTLET = null;
    private JRFillParameter parameter_REPORT_FILE_RESOLVER = null;
    private JRFillParameter parameter_REPORT_FORMAT_FACTORY = null;
    private JRFillParameter parameter_REPORT_PARAMETERS_MAP = null;
    private JRFillParameter parameter_REPORT_RESOURCE_BUNDLE = null;
    private JRFillParameter parameter_parameter = null;
    private JRFillParameter parameter_REPORT_DATA_SOURCE = null;
    private JRFillParameter parameter_REPORT_CONTEXT = null;
    private JRFillParameter parameter_REPORT_CLASS_LOADER = null;
    private JRFillParameter parameter_REPORT_URL_HANDLER_FACTORY = null;
    private JRFillParameter parameter_REPORT_VIRTUALIZER = null;
    private JRFillParameter parameter_SORT_FIELDS = null;
    private JRFillField field_TOTALHRSDAY = null;
    private JRFillField field_INVOICEDATE = null;
    private JRFillField field_STARTDATE = null;
    private JRFillField field_ENDTIME = null;
    private JRFillField field_SERVICETAX = null;
    private JRFillField field_DESC3AMOUNT = null;
    private JRFillField field_DESC1AMOUNT = null;
    private JRFillField field_DESC1RATE = null;
    private JRFillField field_STARTKM = null;
    private JRFillField field_GRANDTOTAL = null;
    private JRFillField field_SUBTOTAL = null;
    private JRFillField field_USERNAME = null;
    private JRFillField field_VEHICLENO = null;
    private JRFillField field_SWATCHBARATTAX = null;
    private JRFillField field_DESC3 = null;
    private JRFillField field_TOTALKM = null;
    private JRFillField field_DESC1 = null;
    private JRFillField field_DESC2RATE = null;
    private JRFillField field_TOLLPARKING = null;
    private JRFillField field_DESC2 = null;
    private JRFillField field_INVOICENO = null;
    private JRFillField field_ENDKM = null;
    private JRFillField field_ENDDATE = null;
    private JRFillField field_DESC3RATE = null;
    private JRFillField field_STARTTIME = null;
    private JRFillField field_TOO = null;
    private JRFillField field_BOOKEDBY = null;
    private JRFillField field_KRISHITAX = null;
    private JRFillField field_DESC2AMOUNT = null;
    private JRFillField field_AMOUNTINWORDS = null;
    private JRFillField field_DT_CREATED = null;
    private JRFillField field_VEHICLETYPE = null;
    private JRFillVariable variable_PAGE_NUMBER = null;
    private JRFillVariable variable_COLUMN_NUMBER = null;
    private JRFillVariable variable_REPORT_COUNT = null;
    private JRFillVariable variable_PAGE_COUNT = null;
    private JRFillVariable variable_COLUMN_COUNT = null;


    /**
     *
     */
    public void customizedInit(
        Map pm,
        Map fm,
        Map vm
        )
    {
        initParams(pm);
        initFields(fm);
        initVars(vm);
    }


    /**
     *
     */
    private void initParams(Map pm)
    {
        parameter_IS_IGNORE_PAGINATION = (JRFillParameter)pm.get("IS_IGNORE_PAGINATION");
        parameter_REPORT_CONNECTION = (JRFillParameter)pm.get("REPORT_CONNECTION");
        parameter_FILTER = (JRFillParameter)pm.get("FILTER");
        parameter_JASPER_REPORT = (JRFillParameter)pm.get("JASPER_REPORT");
        parameter_REPORT_LOCALE = (JRFillParameter)pm.get("REPORT_LOCALE");
        parameter_REPORT_TIME_ZONE = (JRFillParameter)pm.get("REPORT_TIME_ZONE");
        parameter_REPORT_TEMPLATES = (JRFillParameter)pm.get("REPORT_TEMPLATES");
        parameter_REPORT_MAX_COUNT = (JRFillParameter)pm.get("REPORT_MAX_COUNT");
        parameter_REPORT_SCRIPTLET = (JRFillParameter)pm.get("REPORT_SCRIPTLET");
        parameter_REPORT_FILE_RESOLVER = (JRFillParameter)pm.get("REPORT_FILE_RESOLVER");
        parameter_REPORT_FORMAT_FACTORY = (JRFillParameter)pm.get("REPORT_FORMAT_FACTORY");
        parameter_REPORT_PARAMETERS_MAP = (JRFillParameter)pm.get("REPORT_PARAMETERS_MAP");
        parameter_REPORT_RESOURCE_BUNDLE = (JRFillParameter)pm.get("REPORT_RESOURCE_BUNDLE");
        parameter_parameter = (JRFillParameter)pm.get("parameter");
        parameter_REPORT_DATA_SOURCE = (JRFillParameter)pm.get("REPORT_DATA_SOURCE");
        parameter_REPORT_CONTEXT = (JRFillParameter)pm.get("REPORT_CONTEXT");
        parameter_REPORT_CLASS_LOADER = (JRFillParameter)pm.get("REPORT_CLASS_LOADER");
        parameter_REPORT_URL_HANDLER_FACTORY = (JRFillParameter)pm.get("REPORT_URL_HANDLER_FACTORY");
        parameter_REPORT_VIRTUALIZER = (JRFillParameter)pm.get("REPORT_VIRTUALIZER");
        parameter_SORT_FIELDS = (JRFillParameter)pm.get("SORT_FIELDS");
    }


    /**
     *
     */
    private void initFields(Map fm)
    {
        field_TOTALHRSDAY = (JRFillField)fm.get("TOTALHRSDAY");
        field_INVOICEDATE = (JRFillField)fm.get("INVOICEDATE");
        field_STARTDATE = (JRFillField)fm.get("STARTDATE");
        field_ENDTIME = (JRFillField)fm.get("ENDTIME");
        field_SERVICETAX = (JRFillField)fm.get("SERVICETAX");
        field_DESC3AMOUNT = (JRFillField)fm.get("DESC3AMOUNT");
        field_DESC1AMOUNT = (JRFillField)fm.get("DESC1AMOUNT");
        field_DESC1RATE = (JRFillField)fm.get("DESC1RATE");
        field_STARTKM = (JRFillField)fm.get("STARTKM");
        field_GRANDTOTAL = (JRFillField)fm.get("GRANDTOTAL");
        field_SUBTOTAL = (JRFillField)fm.get("SUBTOTAL");
        field_USERNAME = (JRFillField)fm.get("USERNAME");
        field_VEHICLENO = (JRFillField)fm.get("VEHICLENO");
        field_SWATCHBARATTAX = (JRFillField)fm.get("SWATCHBARATTAX");
        field_DESC3 = (JRFillField)fm.get("DESC3");
        field_TOTALKM = (JRFillField)fm.get("TOTALKM");
        field_DESC1 = (JRFillField)fm.get("DESC1");
        field_DESC2RATE = (JRFillField)fm.get("DESC2RATE");
        field_TOLLPARKING = (JRFillField)fm.get("TOLLPARKING");
        field_DESC2 = (JRFillField)fm.get("DESC2");
        field_INVOICENO = (JRFillField)fm.get("INVOICENO");
        field_ENDKM = (JRFillField)fm.get("ENDKM");
        field_ENDDATE = (JRFillField)fm.get("ENDDATE");
        field_DESC3RATE = (JRFillField)fm.get("DESC3RATE");
        field_STARTTIME = (JRFillField)fm.get("STARTTIME");
        field_TOO = (JRFillField)fm.get("TOO");
        field_BOOKEDBY = (JRFillField)fm.get("BOOKEDBY");
        field_KRISHITAX = (JRFillField)fm.get("KRISHITAX");
        field_DESC2AMOUNT = (JRFillField)fm.get("DESC2AMOUNT");
        field_AMOUNTINWORDS = (JRFillField)fm.get("AMOUNTINWORDS");
        field_DT_CREATED = (JRFillField)fm.get("DT_CREATED");
        field_VEHICLETYPE = (JRFillField)fm.get("VEHICLETYPE");
    }


    /**
     *
     */
    private void initVars(Map vm)
    {
        variable_PAGE_NUMBER = (JRFillVariable)vm.get("PAGE_NUMBER");
        variable_COLUMN_NUMBER = (JRFillVariable)vm.get("COLUMN_NUMBER");
        variable_REPORT_COUNT = (JRFillVariable)vm.get("REPORT_COUNT");
        variable_PAGE_COUNT = (JRFillVariable)vm.get("PAGE_COUNT");
        variable_COLUMN_COUNT = (JRFillVariable)vm.get("COLUMN_COUNT");
    }


    /**
     *
     */
    public Object evaluate(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = null; //$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = "C:\\Users\\LENOVO\\Desktop\\Logo1.png"; //$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = "C:\\Users\\LENOVO\\Desktop\\Logo2.png"; //$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = ((java.lang.Integer)field_INVOICENO.getValue()); //$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = ((java.lang.String)field_TOO.getValue()); //$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = ((java.lang.String)field_USERNAME.getValue()); //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = ((java.lang.String)field_VEHICLETYPE.getValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = ((java.lang.String)field_BOOKEDBY.getValue()); //$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = ((java.lang.String)field_VEHICLENO.getValue()); //$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = ((java.lang.Integer)field_STARTKM.getValue()); //$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = ((java.lang.Integer)field_ENDKM.getValue()); //$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = ((java.lang.Integer)field_TOTALKM.getValue()); //$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = ((java.lang.String)field_TOTALHRSDAY.getValue()); //$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = ((java.lang.String)field_DESC1.getValue()); //$JR_EXPR_ID=21$
                break;
            }
            case 22 : 
            {
                value = ((java.lang.String)field_DESC2.getValue()); //$JR_EXPR_ID=22$
                break;
            }
            case 23 : 
            {
                value = ((java.lang.String)field_DESC3.getValue()); //$JR_EXPR_ID=23$
                break;
            }
            case 24 : 
            {
                value = ((java.lang.String)field_DESC1RATE.getValue()); //$JR_EXPR_ID=24$
                break;
            }
            case 25 : 
            {
                value = ((java.lang.String)field_DESC2RATE.getValue()); //$JR_EXPR_ID=25$
                break;
            }
            case 26 : 
            {
                value = ((java.lang.String)field_DESC3RATE.getValue()); //$JR_EXPR_ID=26$
                break;
            }
            case 27 : 
            {
                value = ((java.lang.String)field_DESC1AMOUNT.getValue()); //$JR_EXPR_ID=27$
                break;
            }
            case 28 : 
            {
                value = ((java.lang.String)field_DESC2AMOUNT.getValue()); //$JR_EXPR_ID=28$
                break;
            }
            case 29 : 
            {
                value = ((java.lang.String)field_DESC3AMOUNT.getValue()); //$JR_EXPR_ID=29$
                break;
            }
            case 30 : 
            {
                value = ((java.lang.String)field_TOLLPARKING.getValue()); //$JR_EXPR_ID=30$
                break;
            }
            case 31 : 
            {
                value = ((java.lang.String)field_SERVICETAX.getValue()); //$JR_EXPR_ID=31$
                break;
            }
            case 32 : 
            {
                value = ((java.lang.String)field_SWATCHBARATTAX.getValue()); //$JR_EXPR_ID=32$
                break;
            }
            case 33 : 
            {
                value = ((java.lang.String)field_KRISHITAX.getValue()); //$JR_EXPR_ID=33$
                break;
            }
            case 34 : 
            {
                value = ((java.lang.String)field_GRANDTOTAL.getValue()); //$JR_EXPR_ID=34$
                break;
            }
            case 35 : 
            {
                value = ((java.lang.String)field_AMOUNTINWORDS.getValue()); //$JR_EXPR_ID=35$
                break;
            }
            case 36 : 
            {
                value = ((java.lang.String)field_SUBTOTAL.getValue()); //$JR_EXPR_ID=36$
                break;
            }
            case 37 : 
            {
                value = ((java.lang.String)field_INVOICEDATE.getValue()); //$JR_EXPR_ID=37$
                break;
            }
            case 38 : 
            {
                value = ((java.lang.String)field_STARTDATE.getValue()); //$JR_EXPR_ID=38$
                break;
            }
            case 39 : 
            {
                value = ((java.lang.String)field_ENDDATE.getValue()); //$JR_EXPR_ID=39$
                break;
            }
            case 40 : 
            {
                value = ((java.lang.String)field_STARTTIME.getValue()); //$JR_EXPR_ID=40$
                break;
            }
            case 41 : 
            {
                value = ((java.lang.String)field_ENDTIME.getValue()); //$JR_EXPR_ID=41$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateOld(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = null; //$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = "C:\\Users\\LENOVO\\Desktop\\Logo1.png"; //$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = "C:\\Users\\LENOVO\\Desktop\\Logo2.png"; //$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = ((java.lang.Integer)field_INVOICENO.getOldValue()); //$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = ((java.lang.String)field_TOO.getOldValue()); //$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = ((java.lang.String)field_USERNAME.getOldValue()); //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = ((java.lang.String)field_VEHICLETYPE.getOldValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = ((java.lang.String)field_BOOKEDBY.getOldValue()); //$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = ((java.lang.String)field_VEHICLENO.getOldValue()); //$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = ((java.lang.Integer)field_STARTKM.getOldValue()); //$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = ((java.lang.Integer)field_ENDKM.getOldValue()); //$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = ((java.lang.Integer)field_TOTALKM.getOldValue()); //$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = ((java.lang.String)field_TOTALHRSDAY.getOldValue()); //$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = ((java.lang.String)field_DESC1.getOldValue()); //$JR_EXPR_ID=21$
                break;
            }
            case 22 : 
            {
                value = ((java.lang.String)field_DESC2.getOldValue()); //$JR_EXPR_ID=22$
                break;
            }
            case 23 : 
            {
                value = ((java.lang.String)field_DESC3.getOldValue()); //$JR_EXPR_ID=23$
                break;
            }
            case 24 : 
            {
                value = ((java.lang.String)field_DESC1RATE.getOldValue()); //$JR_EXPR_ID=24$
                break;
            }
            case 25 : 
            {
                value = ((java.lang.String)field_DESC2RATE.getOldValue()); //$JR_EXPR_ID=25$
                break;
            }
            case 26 : 
            {
                value = ((java.lang.String)field_DESC3RATE.getOldValue()); //$JR_EXPR_ID=26$
                break;
            }
            case 27 : 
            {
                value = ((java.lang.String)field_DESC1AMOUNT.getOldValue()); //$JR_EXPR_ID=27$
                break;
            }
            case 28 : 
            {
                value = ((java.lang.String)field_DESC2AMOUNT.getOldValue()); //$JR_EXPR_ID=28$
                break;
            }
            case 29 : 
            {
                value = ((java.lang.String)field_DESC3AMOUNT.getOldValue()); //$JR_EXPR_ID=29$
                break;
            }
            case 30 : 
            {
                value = ((java.lang.String)field_TOLLPARKING.getOldValue()); //$JR_EXPR_ID=30$
                break;
            }
            case 31 : 
            {
                value = ((java.lang.String)field_SERVICETAX.getOldValue()); //$JR_EXPR_ID=31$
                break;
            }
            case 32 : 
            {
                value = ((java.lang.String)field_SWATCHBARATTAX.getOldValue()); //$JR_EXPR_ID=32$
                break;
            }
            case 33 : 
            {
                value = ((java.lang.String)field_KRISHITAX.getOldValue()); //$JR_EXPR_ID=33$
                break;
            }
            case 34 : 
            {
                value = ((java.lang.String)field_GRANDTOTAL.getOldValue()); //$JR_EXPR_ID=34$
                break;
            }
            case 35 : 
            {
                value = ((java.lang.String)field_AMOUNTINWORDS.getOldValue()); //$JR_EXPR_ID=35$
                break;
            }
            case 36 : 
            {
                value = ((java.lang.String)field_SUBTOTAL.getOldValue()); //$JR_EXPR_ID=36$
                break;
            }
            case 37 : 
            {
                value = ((java.lang.String)field_INVOICEDATE.getOldValue()); //$JR_EXPR_ID=37$
                break;
            }
            case 38 : 
            {
                value = ((java.lang.String)field_STARTDATE.getOldValue()); //$JR_EXPR_ID=38$
                break;
            }
            case 39 : 
            {
                value = ((java.lang.String)field_ENDDATE.getOldValue()); //$JR_EXPR_ID=39$
                break;
            }
            case 40 : 
            {
                value = ((java.lang.String)field_STARTTIME.getOldValue()); //$JR_EXPR_ID=40$
                break;
            }
            case 41 : 
            {
                value = ((java.lang.String)field_ENDTIME.getOldValue()); //$JR_EXPR_ID=41$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


    /**
     *
     */
    public Object evaluateEstimated(int id) throws Throwable
    {
        Object value = null;

        switch (id)
        {
            case 0 : 
            {
                value = null; //$JR_EXPR_ID=0$
                break;
            }
            case 1 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=1$
                break;
            }
            case 2 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=2$
                break;
            }
            case 3 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=3$
                break;
            }
            case 4 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=4$
                break;
            }
            case 5 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=5$
                break;
            }
            case 6 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=6$
                break;
            }
            case 7 : 
            {
                value = new java.lang.Integer(1); //$JR_EXPR_ID=7$
                break;
            }
            case 8 : 
            {
                value = new java.lang.Integer(0); //$JR_EXPR_ID=8$
                break;
            }
            case 9 : 
            {
                value = "C:\\Users\\LENOVO\\Desktop\\Logo1.png"; //$JR_EXPR_ID=9$
                break;
            }
            case 10 : 
            {
                value = "C:\\Users\\LENOVO\\Desktop\\Logo2.png"; //$JR_EXPR_ID=10$
                break;
            }
            case 11 : 
            {
                value = ((java.lang.Integer)field_INVOICENO.getValue()); //$JR_EXPR_ID=11$
                break;
            }
            case 12 : 
            {
                value = ((java.lang.String)field_TOO.getValue()); //$JR_EXPR_ID=12$
                break;
            }
            case 13 : 
            {
                value = ((java.lang.String)field_USERNAME.getValue()); //$JR_EXPR_ID=13$
                break;
            }
            case 14 : 
            {
                value = ((java.lang.String)field_VEHICLETYPE.getValue()); //$JR_EXPR_ID=14$
                break;
            }
            case 15 : 
            {
                value = ((java.lang.String)field_BOOKEDBY.getValue()); //$JR_EXPR_ID=15$
                break;
            }
            case 16 : 
            {
                value = ((java.lang.String)field_VEHICLENO.getValue()); //$JR_EXPR_ID=16$
                break;
            }
            case 17 : 
            {
                value = ((java.lang.Integer)field_STARTKM.getValue()); //$JR_EXPR_ID=17$
                break;
            }
            case 18 : 
            {
                value = ((java.lang.Integer)field_ENDKM.getValue()); //$JR_EXPR_ID=18$
                break;
            }
            case 19 : 
            {
                value = ((java.lang.Integer)field_TOTALKM.getValue()); //$JR_EXPR_ID=19$
                break;
            }
            case 20 : 
            {
                value = ((java.lang.String)field_TOTALHRSDAY.getValue()); //$JR_EXPR_ID=20$
                break;
            }
            case 21 : 
            {
                value = ((java.lang.String)field_DESC1.getValue()); //$JR_EXPR_ID=21$
                break;
            }
            case 22 : 
            {
                value = ((java.lang.String)field_DESC2.getValue()); //$JR_EXPR_ID=22$
                break;
            }
            case 23 : 
            {
                value = ((java.lang.String)field_DESC3.getValue()); //$JR_EXPR_ID=23$
                break;
            }
            case 24 : 
            {
                value = ((java.lang.String)field_DESC1RATE.getValue()); //$JR_EXPR_ID=24$
                break;
            }
            case 25 : 
            {
                value = ((java.lang.String)field_DESC2RATE.getValue()); //$JR_EXPR_ID=25$
                break;
            }
            case 26 : 
            {
                value = ((java.lang.String)field_DESC3RATE.getValue()); //$JR_EXPR_ID=26$
                break;
            }
            case 27 : 
            {
                value = ((java.lang.String)field_DESC1AMOUNT.getValue()); //$JR_EXPR_ID=27$
                break;
            }
            case 28 : 
            {
                value = ((java.lang.String)field_DESC2AMOUNT.getValue()); //$JR_EXPR_ID=28$
                break;
            }
            case 29 : 
            {
                value = ((java.lang.String)field_DESC3AMOUNT.getValue()); //$JR_EXPR_ID=29$
                break;
            }
            case 30 : 
            {
                value = ((java.lang.String)field_TOLLPARKING.getValue()); //$JR_EXPR_ID=30$
                break;
            }
            case 31 : 
            {
                value = ((java.lang.String)field_SERVICETAX.getValue()); //$JR_EXPR_ID=31$
                break;
            }
            case 32 : 
            {
                value = ((java.lang.String)field_SWATCHBARATTAX.getValue()); //$JR_EXPR_ID=32$
                break;
            }
            case 33 : 
            {
                value = ((java.lang.String)field_KRISHITAX.getValue()); //$JR_EXPR_ID=33$
                break;
            }
            case 34 : 
            {
                value = ((java.lang.String)field_GRANDTOTAL.getValue()); //$JR_EXPR_ID=34$
                break;
            }
            case 35 : 
            {
                value = ((java.lang.String)field_AMOUNTINWORDS.getValue()); //$JR_EXPR_ID=35$
                break;
            }
            case 36 : 
            {
                value = ((java.lang.String)field_SUBTOTAL.getValue()); //$JR_EXPR_ID=36$
                break;
            }
            case 37 : 
            {
                value = ((java.lang.String)field_INVOICEDATE.getValue()); //$JR_EXPR_ID=37$
                break;
            }
            case 38 : 
            {
                value = ((java.lang.String)field_STARTDATE.getValue()); //$JR_EXPR_ID=38$
                break;
            }
            case 39 : 
            {
                value = ((java.lang.String)field_ENDDATE.getValue()); //$JR_EXPR_ID=39$
                break;
            }
            case 40 : 
            {
                value = ((java.lang.String)field_STARTTIME.getValue()); //$JR_EXPR_ID=40$
                break;
            }
            case 41 : 
            {
                value = ((java.lang.String)field_ENDTIME.getValue()); //$JR_EXPR_ID=41$
                break;
            }
           default :
           {
           }
        }
        
        return value;
    }


}
