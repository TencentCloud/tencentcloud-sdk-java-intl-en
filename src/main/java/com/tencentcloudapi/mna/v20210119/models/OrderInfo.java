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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderInfo extends AbstractModel {

    /**
    * Account uin of the parent account
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Usage type
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * Order number unique identifier
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Report month, current month by default
    */
    @SerializedName("ReportMonth")
    @Expose
    private String ReportMonth;

    /**
    * Data update time
    */
    @SerializedName("Updated")
    @Expose
    private String Updated;

    /**
     * Get Account uin of the parent account 
     * @return Uin Account uin of the parent account
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Account uin of the parent account
     * @param Uin Account uin of the parent account
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Usage type 
     * @return PackageType Usage type
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set Usage type
     * @param PackageType Usage type
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get Order number unique identifier 
     * @return OrderId Order number unique identifier
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set Order number unique identifier
     * @param OrderId Order number unique identifier
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Report month, current month by default 
     * @return ReportMonth Report month, current month by default
     */
    public String getReportMonth() {
        return this.ReportMonth;
    }

    /**
     * Set Report month, current month by default
     * @param ReportMonth Report month, current month by default
     */
    public void setReportMonth(String ReportMonth) {
        this.ReportMonth = ReportMonth;
    }

    /**
     * Get Data update time 
     * @return Updated Data update time
     */
    public String getUpdated() {
        return this.Updated;
    }

    /**
     * Set Data update time
     * @param Updated Data update time
     */
    public void setUpdated(String Updated) {
        this.Updated = Updated;
    }

    public OrderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderInfo(OrderInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.ReportMonth != null) {
            this.ReportMonth = new String(source.ReportMonth);
        }
        if (source.Updated != null) {
            this.Updated = new String(source.Updated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "ReportMonth", this.ReportMonth);
        this.setParamSimple(map, prefix + "Updated", this.Updated);

    }
}

