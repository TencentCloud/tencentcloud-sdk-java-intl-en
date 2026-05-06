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

public class DescribeWafProtectionResult extends AbstractModel {

    /**
    * Global protection status
    */
    @SerializedName("GlobalStatus")
    @Expose
    private String GlobalStatus;

    /**
    * Protection status
    */
    @SerializedName("ServicesStatus")
    @Expose
    private ServiceWafStatus [] ServicesStatus;

    /**
    * Route protection status
    */
    @SerializedName("RouteStatus")
    @Expose
    private RouteWafStatus [] RouteStatus;

    /**
    * Object protection status
    */
    @SerializedName("ObjectStatus")
    @Expose
    private String ObjectStatus;

    /**
     * Get Global protection status 
     * @return GlobalStatus Global protection status
     */
    public String getGlobalStatus() {
        return this.GlobalStatus;
    }

    /**
     * Set Global protection status
     * @param GlobalStatus Global protection status
     */
    public void setGlobalStatus(String GlobalStatus) {
        this.GlobalStatus = GlobalStatus;
    }

    /**
     * Get Protection status 
     * @return ServicesStatus Protection status
     */
    public ServiceWafStatus [] getServicesStatus() {
        return this.ServicesStatus;
    }

    /**
     * Set Protection status
     * @param ServicesStatus Protection status
     */
    public void setServicesStatus(ServiceWafStatus [] ServicesStatus) {
        this.ServicesStatus = ServicesStatus;
    }

    /**
     * Get Route protection status 
     * @return RouteStatus Route protection status
     */
    public RouteWafStatus [] getRouteStatus() {
        return this.RouteStatus;
    }

    /**
     * Set Route protection status
     * @param RouteStatus Route protection status
     */
    public void setRouteStatus(RouteWafStatus [] RouteStatus) {
        this.RouteStatus = RouteStatus;
    }

    /**
     * Get Object protection status 
     * @return ObjectStatus Object protection status
     */
    public String getObjectStatus() {
        return this.ObjectStatus;
    }

    /**
     * Set Object protection status
     * @param ObjectStatus Object protection status
     */
    public void setObjectStatus(String ObjectStatus) {
        this.ObjectStatus = ObjectStatus;
    }

    public DescribeWafProtectionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWafProtectionResult(DescribeWafProtectionResult source) {
        if (source.GlobalStatus != null) {
            this.GlobalStatus = new String(source.GlobalStatus);
        }
        if (source.ServicesStatus != null) {
            this.ServicesStatus = new ServiceWafStatus[source.ServicesStatus.length];
            for (int i = 0; i < source.ServicesStatus.length; i++) {
                this.ServicesStatus[i] = new ServiceWafStatus(source.ServicesStatus[i]);
            }
        }
        if (source.RouteStatus != null) {
            this.RouteStatus = new RouteWafStatus[source.RouteStatus.length];
            for (int i = 0; i < source.RouteStatus.length; i++) {
                this.RouteStatus[i] = new RouteWafStatus(source.RouteStatus[i]);
            }
        }
        if (source.ObjectStatus != null) {
            this.ObjectStatus = new String(source.ObjectStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalStatus", this.GlobalStatus);
        this.setParamArrayObj(map, prefix + "ServicesStatus.", this.ServicesStatus);
        this.setParamArrayObj(map, prefix + "RouteStatus.", this.RouteStatus);
        this.setParamSimple(map, prefix + "ObjectStatus", this.ObjectStatus);

    }
}

