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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOnCallFormsRequest extends AbstractModel {

    /**
    * The fixed value is monitor.
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Pagination start offset.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of pages for pagination query.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Supports searching based on user ID.
    */
    @SerializedName("OnCallFormStaffIDs")
    @Expose
    private String [] OnCallFormStaffIDs;

    /**
    * Rotation type
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * Sorting method.
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Supports searching bay on ID and name.
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
     * Get The fixed value is monitor. 
     * @return Module The fixed value is monitor.
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set The fixed value is monitor.
     * @param Module The fixed value is monitor.
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Pagination start offset. 
     * @return Offset Pagination start offset.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination start offset.
     * @param Offset Pagination start offset.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of pages for pagination query. 
     * @return Limit Number of pages for pagination query.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of pages for pagination query.
     * @param Limit Number of pages for pagination query.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Supports searching based on user ID. 
     * @return OnCallFormStaffIDs Supports searching based on user ID.
     */
    public String [] getOnCallFormStaffIDs() {
        return this.OnCallFormStaffIDs;
    }

    /**
     * Set Supports searching based on user ID.
     * @param OnCallFormStaffIDs Supports searching based on user ID.
     */
    public void setOnCallFormStaffIDs(String [] OnCallFormStaffIDs) {
        this.OnCallFormStaffIDs = OnCallFormStaffIDs;
    }

    /**
     * Get Rotation type 
     * @return RotationType Rotation type
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set Rotation type
     * @param RotationType Rotation type
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get Sorting method. 
     * @return Order Sorting method.
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sorting method.
     * @param Order Sorting method.
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Supports searching bay on ID and name. 
     * @return OnCallFormName Supports searching bay on ID and name.
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set Supports searching bay on ID and name.
     * @param OnCallFormName Supports searching bay on ID and name.
     */
    public void setOnCallFormName(String OnCallFormName) {
        this.OnCallFormName = OnCallFormName;
    }

    public DescribeOnCallFormsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOnCallFormsRequest(DescribeOnCallFormsRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OnCallFormStaffIDs != null) {
            this.OnCallFormStaffIDs = new String[source.OnCallFormStaffIDs.length];
            for (int i = 0; i < source.OnCallFormStaffIDs.length; i++) {
                this.OnCallFormStaffIDs[i] = new String(source.OnCallFormStaffIDs[i]);
            }
        }
        if (source.RotationType != null) {
            this.RotationType = new String(source.RotationType);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OnCallFormName != null) {
            this.OnCallFormName = new String(source.OnCallFormName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "OnCallFormStaffIDs.", this.OnCallFormStaffIDs);
        this.setParamSimple(map, prefix + "RotationType", this.RotationType);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OnCallFormName", this.OnCallFormName);

    }
}

