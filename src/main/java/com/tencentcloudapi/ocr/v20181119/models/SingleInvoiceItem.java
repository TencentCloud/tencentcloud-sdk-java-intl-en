/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleInvoiceItem extends AbstractModel {

    /**
    * Special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatSpecialInvoice")
    @Expose
    private VatInvoiceInfo VatSpecialInvoice;

    /**
    * General VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatCommonInvoice")
    @Expose
    private VatInvoiceInfo VatCommonInvoice;

    /**
    * Electronic general VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatElectronicCommonInvoice")
    @Expose
    private VatInvoiceInfo VatElectronicCommonInvoice;

    /**
    * Electronic special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatElectronicSpecialInvoice")
    @Expose
    private VatInvoiceInfo VatElectronicSpecialInvoice;

    /**
    * Blockchain electronic invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatElectronicInvoiceBlockchain")
    @Expose
    private VatInvoiceInfo VatElectronicInvoiceBlockchain;

    /**
    * Electronic general VAT invoice (toll)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatElectronicInvoiceToll")
    @Expose
    private VatInvoiceInfo VatElectronicInvoiceToll;

    /**
    * Electronic invoice (special)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatElectronicSpecialInvoiceFull")
    @Expose
    private VatElectronicInfo VatElectronicSpecialInvoiceFull;

    /**
    * Electronic invoice (general)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatElectronicInvoiceFull")
    @Expose
    private VatElectronicInfo VatElectronicInvoiceFull;

    /**
    * General machine-printed invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachinePrintedInvoice")
    @Expose
    private MachinePrintedInvoice MachinePrintedInvoice;

    /**
    * Bus ticket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BusInvoice")
    @Expose
    private BusInvoice BusInvoice;

    /**
    * Ship ticket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ShippingInvoice")
    @Expose
    private ShippingInvoice ShippingInvoice;

    /**
    * Toll receipt
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TollInvoice")
    @Expose
    private TollInvoice TollInvoice;

    /**
    * Other invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OtherInvoice")
    @Expose
    private OtherInvoice OtherInvoice;

    /**
    * Motor vehicle sales invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MotorVehicleSaleInvoice")
    @Expose
    private MotorVehicleSaleInvoice MotorVehicleSaleInvoice;

    /**
    * Used car invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsedCarPurchaseInvoice")
    @Expose
    private UsedCarPurchaseInvoice UsedCarPurchaseInvoice;

    /**
    * General VAT invoice (roll)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VatInvoiceRoll")
    @Expose
    private VatInvoiceRoll VatInvoiceRoll;

    /**
    * Taxi receipt
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaxiTicket")
    @Expose
    private TaxiTicket TaxiTicket;

    /**
    * Quota invoice
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QuotaInvoice")
    @Expose
    private QuotaInvoice QuotaInvoice;

    /**
    * Itinerary/Receipt of e-ticket for air transportation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AirTransport")
    @Expose
    private AirTransport AirTransport;

    /**
    * Non-tax revenue general receipt
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NonTaxIncomeGeneralBill")
    @Expose
    private NonTaxIncomeBill NonTaxIncomeGeneralBill;

    /**
    * Non-tax revenue unified payment voucher
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NonTaxIncomeElectronicBill")
    @Expose
    private NonTaxIncomeBill NonTaxIncomeElectronicBill;

    /**
    * Train ticket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrainTicket")
    @Expose
    private TrainTicket TrainTicket;

    /**
    * 
    */
    @SerializedName("MedicalOutpatientInvoice")
    @Expose
    private MedicalInvoice MedicalOutpatientInvoice;

    /**
    * 
    */
    @SerializedName("MedicalHospitalizedInvoice")
    @Expose
    private MedicalInvoice MedicalHospitalizedInvoice;

    /**
     * Get Special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatSpecialInvoice Special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatInvoiceInfo getVatSpecialInvoice() {
        return this.VatSpecialInvoice;
    }

    /**
     * Set Special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatSpecialInvoice Special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatSpecialInvoice(VatInvoiceInfo VatSpecialInvoice) {
        this.VatSpecialInvoice = VatSpecialInvoice;
    }

    /**
     * Get General VAT invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatCommonInvoice General VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatInvoiceInfo getVatCommonInvoice() {
        return this.VatCommonInvoice;
    }

    /**
     * Set General VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatCommonInvoice General VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatCommonInvoice(VatInvoiceInfo VatCommonInvoice) {
        this.VatCommonInvoice = VatCommonInvoice;
    }

    /**
     * Get Electronic general VAT invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatElectronicCommonInvoice Electronic general VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatInvoiceInfo getVatElectronicCommonInvoice() {
        return this.VatElectronicCommonInvoice;
    }

    /**
     * Set Electronic general VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatElectronicCommonInvoice Electronic general VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatElectronicCommonInvoice(VatInvoiceInfo VatElectronicCommonInvoice) {
        this.VatElectronicCommonInvoice = VatElectronicCommonInvoice;
    }

    /**
     * Get Electronic special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatElectronicSpecialInvoice Electronic special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatInvoiceInfo getVatElectronicSpecialInvoice() {
        return this.VatElectronicSpecialInvoice;
    }

    /**
     * Set Electronic special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatElectronicSpecialInvoice Electronic special VAT invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatElectronicSpecialInvoice(VatInvoiceInfo VatElectronicSpecialInvoice) {
        this.VatElectronicSpecialInvoice = VatElectronicSpecialInvoice;
    }

    /**
     * Get Blockchain electronic invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatElectronicInvoiceBlockchain Blockchain electronic invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatInvoiceInfo getVatElectronicInvoiceBlockchain() {
        return this.VatElectronicInvoiceBlockchain;
    }

    /**
     * Set Blockchain electronic invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatElectronicInvoiceBlockchain Blockchain electronic invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatElectronicInvoiceBlockchain(VatInvoiceInfo VatElectronicInvoiceBlockchain) {
        this.VatElectronicInvoiceBlockchain = VatElectronicInvoiceBlockchain;
    }

    /**
     * Get Electronic general VAT invoice (toll)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatElectronicInvoiceToll Electronic general VAT invoice (toll)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatInvoiceInfo getVatElectronicInvoiceToll() {
        return this.VatElectronicInvoiceToll;
    }

    /**
     * Set Electronic general VAT invoice (toll)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatElectronicInvoiceToll Electronic general VAT invoice (toll)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatElectronicInvoiceToll(VatInvoiceInfo VatElectronicInvoiceToll) {
        this.VatElectronicInvoiceToll = VatElectronicInvoiceToll;
    }

    /**
     * Get Electronic invoice (special)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatElectronicSpecialInvoiceFull Electronic invoice (special)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatElectronicInfo getVatElectronicSpecialInvoiceFull() {
        return this.VatElectronicSpecialInvoiceFull;
    }

    /**
     * Set Electronic invoice (special)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatElectronicSpecialInvoiceFull Electronic invoice (special)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatElectronicSpecialInvoiceFull(VatElectronicInfo VatElectronicSpecialInvoiceFull) {
        this.VatElectronicSpecialInvoiceFull = VatElectronicSpecialInvoiceFull;
    }

    /**
     * Get Electronic invoice (general)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatElectronicInvoiceFull Electronic invoice (general)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatElectronicInfo getVatElectronicInvoiceFull() {
        return this.VatElectronicInvoiceFull;
    }

    /**
     * Set Electronic invoice (general)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatElectronicInvoiceFull Electronic invoice (general)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatElectronicInvoiceFull(VatElectronicInfo VatElectronicInvoiceFull) {
        this.VatElectronicInvoiceFull = VatElectronicInvoiceFull;
    }

    /**
     * Get General machine-printed invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachinePrintedInvoice General machine-printed invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachinePrintedInvoice getMachinePrintedInvoice() {
        return this.MachinePrintedInvoice;
    }

    /**
     * Set General machine-printed invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachinePrintedInvoice General machine-printed invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachinePrintedInvoice(MachinePrintedInvoice MachinePrintedInvoice) {
        this.MachinePrintedInvoice = MachinePrintedInvoice;
    }

    /**
     * Get Bus ticket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BusInvoice Bus ticket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BusInvoice getBusInvoice() {
        return this.BusInvoice;
    }

    /**
     * Set Bus ticket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BusInvoice Bus ticket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBusInvoice(BusInvoice BusInvoice) {
        this.BusInvoice = BusInvoice;
    }

    /**
     * Get Ship ticket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ShippingInvoice Ship ticket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ShippingInvoice getShippingInvoice() {
        return this.ShippingInvoice;
    }

    /**
     * Set Ship ticket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ShippingInvoice Ship ticket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setShippingInvoice(ShippingInvoice ShippingInvoice) {
        this.ShippingInvoice = ShippingInvoice;
    }

    /**
     * Get Toll receipt
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TollInvoice Toll receipt
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TollInvoice getTollInvoice() {
        return this.TollInvoice;
    }

    /**
     * Set Toll receipt
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TollInvoice Toll receipt
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTollInvoice(TollInvoice TollInvoice) {
        this.TollInvoice = TollInvoice;
    }

    /**
     * Get Other invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OtherInvoice Other invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OtherInvoice getOtherInvoice() {
        return this.OtherInvoice;
    }

    /**
     * Set Other invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OtherInvoice Other invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOtherInvoice(OtherInvoice OtherInvoice) {
        this.OtherInvoice = OtherInvoice;
    }

    /**
     * Get Motor vehicle sales invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MotorVehicleSaleInvoice Motor vehicle sales invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MotorVehicleSaleInvoice getMotorVehicleSaleInvoice() {
        return this.MotorVehicleSaleInvoice;
    }

    /**
     * Set Motor vehicle sales invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MotorVehicleSaleInvoice Motor vehicle sales invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMotorVehicleSaleInvoice(MotorVehicleSaleInvoice MotorVehicleSaleInvoice) {
        this.MotorVehicleSaleInvoice = MotorVehicleSaleInvoice;
    }

    /**
     * Get Used car invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UsedCarPurchaseInvoice Used car invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public UsedCarPurchaseInvoice getUsedCarPurchaseInvoice() {
        return this.UsedCarPurchaseInvoice;
    }

    /**
     * Set Used car invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UsedCarPurchaseInvoice Used car invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsedCarPurchaseInvoice(UsedCarPurchaseInvoice UsedCarPurchaseInvoice) {
        this.UsedCarPurchaseInvoice = UsedCarPurchaseInvoice;
    }

    /**
     * Get General VAT invoice (roll)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VatInvoiceRoll General VAT invoice (roll)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public VatInvoiceRoll getVatInvoiceRoll() {
        return this.VatInvoiceRoll;
    }

    /**
     * Set General VAT invoice (roll)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VatInvoiceRoll General VAT invoice (roll)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVatInvoiceRoll(VatInvoiceRoll VatInvoiceRoll) {
        this.VatInvoiceRoll = VatInvoiceRoll;
    }

    /**
     * Get Taxi receipt
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaxiTicket Taxi receipt
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaxiTicket getTaxiTicket() {
        return this.TaxiTicket;
    }

    /**
     * Set Taxi receipt
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaxiTicket Taxi receipt
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaxiTicket(TaxiTicket TaxiTicket) {
        this.TaxiTicket = TaxiTicket;
    }

    /**
     * Get Quota invoice
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QuotaInvoice Quota invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QuotaInvoice getQuotaInvoice() {
        return this.QuotaInvoice;
    }

    /**
     * Set Quota invoice
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QuotaInvoice Quota invoice
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuotaInvoice(QuotaInvoice QuotaInvoice) {
        this.QuotaInvoice = QuotaInvoice;
    }

    /**
     * Get Itinerary/Receipt of e-ticket for air transportation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AirTransport Itinerary/Receipt of e-ticket for air transportation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AirTransport getAirTransport() {
        return this.AirTransport;
    }

    /**
     * Set Itinerary/Receipt of e-ticket for air transportation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AirTransport Itinerary/Receipt of e-ticket for air transportation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAirTransport(AirTransport AirTransport) {
        this.AirTransport = AirTransport;
    }

    /**
     * Get Non-tax revenue general receipt
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NonTaxIncomeGeneralBill Non-tax revenue general receipt
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NonTaxIncomeBill getNonTaxIncomeGeneralBill() {
        return this.NonTaxIncomeGeneralBill;
    }

    /**
     * Set Non-tax revenue general receipt
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NonTaxIncomeGeneralBill Non-tax revenue general receipt
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNonTaxIncomeGeneralBill(NonTaxIncomeBill NonTaxIncomeGeneralBill) {
        this.NonTaxIncomeGeneralBill = NonTaxIncomeGeneralBill;
    }

    /**
     * Get Non-tax revenue unified payment voucher
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NonTaxIncomeElectronicBill Non-tax revenue unified payment voucher
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NonTaxIncomeBill getNonTaxIncomeElectronicBill() {
        return this.NonTaxIncomeElectronicBill;
    }

    /**
     * Set Non-tax revenue unified payment voucher
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NonTaxIncomeElectronicBill Non-tax revenue unified payment voucher
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNonTaxIncomeElectronicBill(NonTaxIncomeBill NonTaxIncomeElectronicBill) {
        this.NonTaxIncomeElectronicBill = NonTaxIncomeElectronicBill;
    }

    /**
     * Get Train ticket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrainTicket Train ticket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TrainTicket getTrainTicket() {
        return this.TrainTicket;
    }

    /**
     * Set Train ticket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrainTicket Train ticket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrainTicket(TrainTicket TrainTicket) {
        this.TrainTicket = TrainTicket;
    }

    /**
     * Get  
     * @return MedicalOutpatientInvoice 
     */
    public MedicalInvoice getMedicalOutpatientInvoice() {
        return this.MedicalOutpatientInvoice;
    }

    /**
     * Set 
     * @param MedicalOutpatientInvoice 
     */
    public void setMedicalOutpatientInvoice(MedicalInvoice MedicalOutpatientInvoice) {
        this.MedicalOutpatientInvoice = MedicalOutpatientInvoice;
    }

    /**
     * Get  
     * @return MedicalHospitalizedInvoice 
     */
    public MedicalInvoice getMedicalHospitalizedInvoice() {
        return this.MedicalHospitalizedInvoice;
    }

    /**
     * Set 
     * @param MedicalHospitalizedInvoice 
     */
    public void setMedicalHospitalizedInvoice(MedicalInvoice MedicalHospitalizedInvoice) {
        this.MedicalHospitalizedInvoice = MedicalHospitalizedInvoice;
    }

    public SingleInvoiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleInvoiceItem(SingleInvoiceItem source) {
        if (source.VatSpecialInvoice != null) {
            this.VatSpecialInvoice = new VatInvoiceInfo(source.VatSpecialInvoice);
        }
        if (source.VatCommonInvoice != null) {
            this.VatCommonInvoice = new VatInvoiceInfo(source.VatCommonInvoice);
        }
        if (source.VatElectronicCommonInvoice != null) {
            this.VatElectronicCommonInvoice = new VatInvoiceInfo(source.VatElectronicCommonInvoice);
        }
        if (source.VatElectronicSpecialInvoice != null) {
            this.VatElectronicSpecialInvoice = new VatInvoiceInfo(source.VatElectronicSpecialInvoice);
        }
        if (source.VatElectronicInvoiceBlockchain != null) {
            this.VatElectronicInvoiceBlockchain = new VatInvoiceInfo(source.VatElectronicInvoiceBlockchain);
        }
        if (source.VatElectronicInvoiceToll != null) {
            this.VatElectronicInvoiceToll = new VatInvoiceInfo(source.VatElectronicInvoiceToll);
        }
        if (source.VatElectronicSpecialInvoiceFull != null) {
            this.VatElectronicSpecialInvoiceFull = new VatElectronicInfo(source.VatElectronicSpecialInvoiceFull);
        }
        if (source.VatElectronicInvoiceFull != null) {
            this.VatElectronicInvoiceFull = new VatElectronicInfo(source.VatElectronicInvoiceFull);
        }
        if (source.MachinePrintedInvoice != null) {
            this.MachinePrintedInvoice = new MachinePrintedInvoice(source.MachinePrintedInvoice);
        }
        if (source.BusInvoice != null) {
            this.BusInvoice = new BusInvoice(source.BusInvoice);
        }
        if (source.ShippingInvoice != null) {
            this.ShippingInvoice = new ShippingInvoice(source.ShippingInvoice);
        }
        if (source.TollInvoice != null) {
            this.TollInvoice = new TollInvoice(source.TollInvoice);
        }
        if (source.OtherInvoice != null) {
            this.OtherInvoice = new OtherInvoice(source.OtherInvoice);
        }
        if (source.MotorVehicleSaleInvoice != null) {
            this.MotorVehicleSaleInvoice = new MotorVehicleSaleInvoice(source.MotorVehicleSaleInvoice);
        }
        if (source.UsedCarPurchaseInvoice != null) {
            this.UsedCarPurchaseInvoice = new UsedCarPurchaseInvoice(source.UsedCarPurchaseInvoice);
        }
        if (source.VatInvoiceRoll != null) {
            this.VatInvoiceRoll = new VatInvoiceRoll(source.VatInvoiceRoll);
        }
        if (source.TaxiTicket != null) {
            this.TaxiTicket = new TaxiTicket(source.TaxiTicket);
        }
        if (source.QuotaInvoice != null) {
            this.QuotaInvoice = new QuotaInvoice(source.QuotaInvoice);
        }
        if (source.AirTransport != null) {
            this.AirTransport = new AirTransport(source.AirTransport);
        }
        if (source.NonTaxIncomeGeneralBill != null) {
            this.NonTaxIncomeGeneralBill = new NonTaxIncomeBill(source.NonTaxIncomeGeneralBill);
        }
        if (source.NonTaxIncomeElectronicBill != null) {
            this.NonTaxIncomeElectronicBill = new NonTaxIncomeBill(source.NonTaxIncomeElectronicBill);
        }
        if (source.TrainTicket != null) {
            this.TrainTicket = new TrainTicket(source.TrainTicket);
        }
        if (source.MedicalOutpatientInvoice != null) {
            this.MedicalOutpatientInvoice = new MedicalInvoice(source.MedicalOutpatientInvoice);
        }
        if (source.MedicalHospitalizedInvoice != null) {
            this.MedicalHospitalizedInvoice = new MedicalInvoice(source.MedicalHospitalizedInvoice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VatSpecialInvoice.", this.VatSpecialInvoice);
        this.setParamObj(map, prefix + "VatCommonInvoice.", this.VatCommonInvoice);
        this.setParamObj(map, prefix + "VatElectronicCommonInvoice.", this.VatElectronicCommonInvoice);
        this.setParamObj(map, prefix + "VatElectronicSpecialInvoice.", this.VatElectronicSpecialInvoice);
        this.setParamObj(map, prefix + "VatElectronicInvoiceBlockchain.", this.VatElectronicInvoiceBlockchain);
        this.setParamObj(map, prefix + "VatElectronicInvoiceToll.", this.VatElectronicInvoiceToll);
        this.setParamObj(map, prefix + "VatElectronicSpecialInvoiceFull.", this.VatElectronicSpecialInvoiceFull);
        this.setParamObj(map, prefix + "VatElectronicInvoiceFull.", this.VatElectronicInvoiceFull);
        this.setParamObj(map, prefix + "MachinePrintedInvoice.", this.MachinePrintedInvoice);
        this.setParamObj(map, prefix + "BusInvoice.", this.BusInvoice);
        this.setParamObj(map, prefix + "ShippingInvoice.", this.ShippingInvoice);
        this.setParamObj(map, prefix + "TollInvoice.", this.TollInvoice);
        this.setParamObj(map, prefix + "OtherInvoice.", this.OtherInvoice);
        this.setParamObj(map, prefix + "MotorVehicleSaleInvoice.", this.MotorVehicleSaleInvoice);
        this.setParamObj(map, prefix + "UsedCarPurchaseInvoice.", this.UsedCarPurchaseInvoice);
        this.setParamObj(map, prefix + "VatInvoiceRoll.", this.VatInvoiceRoll);
        this.setParamObj(map, prefix + "TaxiTicket.", this.TaxiTicket);
        this.setParamObj(map, prefix + "QuotaInvoice.", this.QuotaInvoice);
        this.setParamObj(map, prefix + "AirTransport.", this.AirTransport);
        this.setParamObj(map, prefix + "NonTaxIncomeGeneralBill.", this.NonTaxIncomeGeneralBill);
        this.setParamObj(map, prefix + "NonTaxIncomeElectronicBill.", this.NonTaxIncomeElectronicBill);
        this.setParamObj(map, prefix + "TrainTicket.", this.TrainTicket);
        this.setParamObj(map, prefix + "MedicalOutpatientInvoice.", this.MedicalOutpatientInvoice);
        this.setParamObj(map, prefix + "MedicalHospitalizedInvoice.", this.MedicalHospitalizedInvoice);

    }
}

