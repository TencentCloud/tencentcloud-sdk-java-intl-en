/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VatElectronicItemInfo extends AbstractModel{

    /**
    * Item name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Quantity
    */
    @SerializedName("Quantity")
    @Expose
    private String Quantity;

    /**
    * Specification
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * Unit price
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * Amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Tax rate
    */
    @SerializedName("TaxRate")
    @Expose
    private String TaxRate;

    /**
    * Tax amount
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Unit
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * Vehicle type
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * Vehicle No.
    */
    @SerializedName("VehicleBrand")
    @Expose
    private String VehicleBrand;

    /**
    * Departure place
    */
    @SerializedName("DeparturePlace")
    @Expose
    private String DeparturePlace;

    /**
    * Destination
    */
    @SerializedName("ArrivalPlace")
    @Expose
    private String ArrivalPlace;

    /**
    * Name of the transported goods. It is returned only for a goods transport service invoice.
    */
    @SerializedName("TransportItemsName")
    @Expose
    private String TransportItemsName;

    /**
    * Location of the construction service. It is returned only for a construction invoice.
    */
    @SerializedName("PlaceOfBuildingService")
    @Expose
    private String PlaceOfBuildingService;

    /**
    * Name of the construction project. It is returned only for a construction invoice.
    */
    @SerializedName("BuildingName")
    @Expose
    private String BuildingName;

    /**
    * Property or real estate ownership certificate No. It is returned only for a real estate operation and leasing service invoice.
    */
    @SerializedName("EstateNumber")
    @Expose
    private String EstateNumber;

    /**
    * Unit of area. It is returned only for a real estate operation and leasing service invoice.
    */
    @SerializedName("AreaUnit")
    @Expose
    private String AreaUnit;

    /**
     * Get Item name 
     * @return Name Item name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Item name
     * @param Name Item name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Quantity 
     * @return Quantity Quantity
     */
    public String getQuantity() {
        return this.Quantity;
    }

    /**
     * Set Quantity
     * @param Quantity Quantity
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get Specification 
     * @return Specification Specification
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set Specification
     * @param Specification Specification
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get Unit price 
     * @return Price Unit price
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set Unit price
     * @param Price Unit price
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get Amount 
     * @return Total Amount
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Amount
     * @param Total Amount
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Tax rate 
     * @return TaxRate Tax rate
     */
    public String getTaxRate() {
        return this.TaxRate;
    }

    /**
     * Set Tax rate
     * @param TaxRate Tax rate
     */
    public void setTaxRate(String TaxRate) {
        this.TaxRate = TaxRate;
    }

    /**
     * Get Tax amount 
     * @return Tax Tax amount
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set Tax amount
     * @param Tax Tax amount
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get Unit 
     * @return Unit Unit
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set Unit
     * @param Unit Unit
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get Vehicle type 
     * @return VehicleType Vehicle type
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set Vehicle type
     * @param VehicleType Vehicle type
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    /**
     * Get Vehicle No. 
     * @return VehicleBrand Vehicle No.
     */
    public String getVehicleBrand() {
        return this.VehicleBrand;
    }

    /**
     * Set Vehicle No.
     * @param VehicleBrand Vehicle No.
     */
    public void setVehicleBrand(String VehicleBrand) {
        this.VehicleBrand = VehicleBrand;
    }

    /**
     * Get Departure place 
     * @return DeparturePlace Departure place
     */
    public String getDeparturePlace() {
        return this.DeparturePlace;
    }

    /**
     * Set Departure place
     * @param DeparturePlace Departure place
     */
    public void setDeparturePlace(String DeparturePlace) {
        this.DeparturePlace = DeparturePlace;
    }

    /**
     * Get Destination 
     * @return ArrivalPlace Destination
     */
    public String getArrivalPlace() {
        return this.ArrivalPlace;
    }

    /**
     * Set Destination
     * @param ArrivalPlace Destination
     */
    public void setArrivalPlace(String ArrivalPlace) {
        this.ArrivalPlace = ArrivalPlace;
    }

    /**
     * Get Name of the transported goods. It is returned only for a goods transport service invoice. 
     * @return TransportItemsName Name of the transported goods. It is returned only for a goods transport service invoice.
     */
    public String getTransportItemsName() {
        return this.TransportItemsName;
    }

    /**
     * Set Name of the transported goods. It is returned only for a goods transport service invoice.
     * @param TransportItemsName Name of the transported goods. It is returned only for a goods transport service invoice.
     */
    public void setTransportItemsName(String TransportItemsName) {
        this.TransportItemsName = TransportItemsName;
    }

    /**
     * Get Location of the construction service. It is returned only for a construction invoice. 
     * @return PlaceOfBuildingService Location of the construction service. It is returned only for a construction invoice.
     */
    public String getPlaceOfBuildingService() {
        return this.PlaceOfBuildingService;
    }

    /**
     * Set Location of the construction service. It is returned only for a construction invoice.
     * @param PlaceOfBuildingService Location of the construction service. It is returned only for a construction invoice.
     */
    public void setPlaceOfBuildingService(String PlaceOfBuildingService) {
        this.PlaceOfBuildingService = PlaceOfBuildingService;
    }

    /**
     * Get Name of the construction project. It is returned only for a construction invoice. 
     * @return BuildingName Name of the construction project. It is returned only for a construction invoice.
     */
    public String getBuildingName() {
        return this.BuildingName;
    }

    /**
     * Set Name of the construction project. It is returned only for a construction invoice.
     * @param BuildingName Name of the construction project. It is returned only for a construction invoice.
     */
    public void setBuildingName(String BuildingName) {
        this.BuildingName = BuildingName;
    }

    /**
     * Get Property or real estate ownership certificate No. It is returned only for a real estate operation and leasing service invoice. 
     * @return EstateNumber Property or real estate ownership certificate No. It is returned only for a real estate operation and leasing service invoice.
     */
    public String getEstateNumber() {
        return this.EstateNumber;
    }

    /**
     * Set Property or real estate ownership certificate No. It is returned only for a real estate operation and leasing service invoice.
     * @param EstateNumber Property or real estate ownership certificate No. It is returned only for a real estate operation and leasing service invoice.
     */
    public void setEstateNumber(String EstateNumber) {
        this.EstateNumber = EstateNumber;
    }

    /**
     * Get Unit of area. It is returned only for a real estate operation and leasing service invoice. 
     * @return AreaUnit Unit of area. It is returned only for a real estate operation and leasing service invoice.
     */
    public String getAreaUnit() {
        return this.AreaUnit;
    }

    /**
     * Set Unit of area. It is returned only for a real estate operation and leasing service invoice.
     * @param AreaUnit Unit of area. It is returned only for a real estate operation and leasing service invoice.
     */
    public void setAreaUnit(String AreaUnit) {
        this.AreaUnit = AreaUnit;
    }

    public VatElectronicItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VatElectronicItemInfo(VatElectronicItemInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Quantity != null) {
            this.Quantity = new String(source.Quantity);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TaxRate != null) {
            this.TaxRate = new String(source.TaxRate);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
        if (source.VehicleBrand != null) {
            this.VehicleBrand = new String(source.VehicleBrand);
        }
        if (source.DeparturePlace != null) {
            this.DeparturePlace = new String(source.DeparturePlace);
        }
        if (source.ArrivalPlace != null) {
            this.ArrivalPlace = new String(source.ArrivalPlace);
        }
        if (source.TransportItemsName != null) {
            this.TransportItemsName = new String(source.TransportItemsName);
        }
        if (source.PlaceOfBuildingService != null) {
            this.PlaceOfBuildingService = new String(source.PlaceOfBuildingService);
        }
        if (source.BuildingName != null) {
            this.BuildingName = new String(source.BuildingName);
        }
        if (source.EstateNumber != null) {
            this.EstateNumber = new String(source.EstateNumber);
        }
        if (source.AreaUnit != null) {
            this.AreaUnit = new String(source.AreaUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TaxRate", this.TaxRate);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "VehicleBrand", this.VehicleBrand);
        this.setParamSimple(map, prefix + "DeparturePlace", this.DeparturePlace);
        this.setParamSimple(map, prefix + "ArrivalPlace", this.ArrivalPlace);
        this.setParamSimple(map, prefix + "TransportItemsName", this.TransportItemsName);
        this.setParamSimple(map, prefix + "PlaceOfBuildingService", this.PlaceOfBuildingService);
        this.setParamSimple(map, prefix + "BuildingName", this.BuildingName);
        this.setParamSimple(map, prefix + "EstateNumber", this.EstateNumber);
        this.setParamSimple(map, prefix + "AreaUnit", this.AreaUnit);

    }
}

