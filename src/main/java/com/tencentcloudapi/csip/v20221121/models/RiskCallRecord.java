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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskCallRecord extends AbstractModel {

    /**
    * API name.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Chinese description of the API.
    */
    @SerializedName("EventDescCN")
    @Expose
    private String EventDescCN;

    /**
    * Interface description.
    */
    @SerializedName("EventDescEN")
    @Expose
    private String EventDescEN;

    /**
    * Product name
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Product Chinese Name
    */
    @SerializedName("ProductNameCN")
    @Expose
    private String ProductNameCN;

    /**
    * Number of calls.
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
     * Get API name. 
     * @return EventName API name.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set API name.
     * @param EventName API name.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Chinese description of the API. 
     * @return EventDescCN Chinese description of the API.
     */
    public String getEventDescCN() {
        return this.EventDescCN;
    }

    /**
     * Set Chinese description of the API.
     * @param EventDescCN Chinese description of the API.
     */
    public void setEventDescCN(String EventDescCN) {
        this.EventDescCN = EventDescCN;
    }

    /**
     * Get Interface description. 
     * @return EventDescEN Interface description.
     */
    public String getEventDescEN() {
        return this.EventDescEN;
    }

    /**
     * Set Interface description.
     * @param EventDescEN Interface description.
     */
    public void setEventDescEN(String EventDescEN) {
        this.EventDescEN = EventDescEN;
    }

    /**
     * Get Product name 
     * @return ProductName Product name
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name
     * @param ProductName Product name
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Product Chinese Name 
     * @return ProductNameCN Product Chinese Name
     */
    public String getProductNameCN() {
        return this.ProductNameCN;
    }

    /**
     * Set Product Chinese Name
     * @param ProductNameCN Product Chinese Name
     */
    public void setProductNameCN(String ProductNameCN) {
        this.ProductNameCN = ProductNameCN;
    }

    /**
     * Get Number of calls. 
     * @return CallCount Number of calls.
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set Number of calls.
     * @param CallCount Number of calls.
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    public RiskCallRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCallRecord(RiskCallRecord source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventDescCN != null) {
            this.EventDescCN = new String(source.EventDescCN);
        }
        if (source.EventDescEN != null) {
            this.EventDescEN = new String(source.EventDescEN);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductNameCN != null) {
            this.ProductNameCN = new String(source.ProductNameCN);
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventDescCN", this.EventDescCN);
        this.setParamSimple(map, prefix + "EventDescEN", this.EventDescEN);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductNameCN", this.ProductNameCN);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);

    }
}

