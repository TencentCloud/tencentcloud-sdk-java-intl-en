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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaneTrafficEntry extends AbstractModel {

    /**
    * // If type == "polarismesh.cn/gateway/tse-gateway", the selector is TSEGatewaySelector.
// type == "polarismesh.cn/gateway/spring-cloud-gateway", selector is ServiceGatewaySelector
// If type == "polarismesh.cn/service", selector is ServiceSelector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EntryType")
    @Expose
    private String EntryType;

    /**
    * TSE cloud-native gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TSEGatewaySelector")
    @Expose
    private TSEGatewaySelector TSEGatewaySelector;

    /**
    * Microservice gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceGatewaySelector")
    @Expose
    private ServiceGatewaySelector ServiceGatewaySelector;

    /**
    * Standard microservice selector
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceSelector")
    @Expose
    private ServiceSelector ServiceSelector;

    /**
     * Get // If type == "polarismesh.cn/gateway/tse-gateway", the selector is TSEGatewaySelector.
// type == "polarismesh.cn/gateway/spring-cloud-gateway", selector is ServiceGatewaySelector
// If type == "polarismesh.cn/service", selector is ServiceSelector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EntryType // If type == "polarismesh.cn/gateway/tse-gateway", the selector is TSEGatewaySelector.
// type == "polarismesh.cn/gateway/spring-cloud-gateway", selector is ServiceGatewaySelector
// If type == "polarismesh.cn/service", selector is ServiceSelector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEntryType() {
        return this.EntryType;
    }

    /**
     * Set // If type == "polarismesh.cn/gateway/tse-gateway", the selector is TSEGatewaySelector.
// type == "polarismesh.cn/gateway/spring-cloud-gateway", selector is ServiceGatewaySelector
// If type == "polarismesh.cn/service", selector is ServiceSelector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EntryType // If type == "polarismesh.cn/gateway/tse-gateway", the selector is TSEGatewaySelector.
// type == "polarismesh.cn/gateway/spring-cloud-gateway", selector is ServiceGatewaySelector
// If type == "polarismesh.cn/service", selector is ServiceSelector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEntryType(String EntryType) {
        this.EntryType = EntryType;
    }

    /**
     * Get TSE cloud-native gateway selector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TSEGatewaySelector TSE cloud-native gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TSEGatewaySelector getTSEGatewaySelector() {
        return this.TSEGatewaySelector;
    }

    /**
     * Set TSE cloud-native gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TSEGatewaySelector TSE cloud-native gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTSEGatewaySelector(TSEGatewaySelector TSEGatewaySelector) {
        this.TSEGatewaySelector = TSEGatewaySelector;
    }

    /**
     * Get Microservice gateway selector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceGatewaySelector Microservice gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceGatewaySelector getServiceGatewaySelector() {
        return this.ServiceGatewaySelector;
    }

    /**
     * Set Microservice gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceGatewaySelector Microservice gateway selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceGatewaySelector(ServiceGatewaySelector ServiceGatewaySelector) {
        this.ServiceGatewaySelector = ServiceGatewaySelector;
    }

    /**
     * Get Standard microservice selector
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ServiceSelector Standard microservice selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ServiceSelector getServiceSelector() {
        return this.ServiceSelector;
    }

    /**
     * Set Standard microservice selector
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ServiceSelector Standard microservice selector
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setServiceSelector(ServiceSelector ServiceSelector) {
        this.ServiceSelector = ServiceSelector;
    }

    public LaneTrafficEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LaneTrafficEntry(LaneTrafficEntry source) {
        if (source.EntryType != null) {
            this.EntryType = new String(source.EntryType);
        }
        if (source.TSEGatewaySelector != null) {
            this.TSEGatewaySelector = new TSEGatewaySelector(source.TSEGatewaySelector);
        }
        if (source.ServiceGatewaySelector != null) {
            this.ServiceGatewaySelector = new ServiceGatewaySelector(source.ServiceGatewaySelector);
        }
        if (source.ServiceSelector != null) {
            this.ServiceSelector = new ServiceSelector(source.ServiceSelector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntryType", this.EntryType);
        this.setParamObj(map, prefix + "TSEGatewaySelector.", this.TSEGatewaySelector);
        this.setParamObj(map, prefix + "ServiceGatewaySelector.", this.ServiceGatewaySelector);
        this.setParamObj(map, prefix + "ServiceSelector.", this.ServiceSelector);

    }
}

