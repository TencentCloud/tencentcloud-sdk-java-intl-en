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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmDefaultThresholdRequest extends AbstractModel{

    /**
    * The alarm service type. Values:
<li>`ddos`: DDoS alarm service.</li>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * The site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * The threshold in Mbps. Maximum value: 10.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * The protection entity, which is a proxy ID when layer-4 protection is enabled, or a site name when layer-7 protection is on.
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
     * Get The alarm service type. Values:
<li>`ddos`: DDoS alarm service.</li> 
     * @return ServiceType The alarm service type. Values:
<li>`ddos`: DDoS alarm service.</li>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set The alarm service type. Values:
<li>`ddos`: DDoS alarm service.</li>
     * @param ServiceType The alarm service type. Values:
<li>`ddos`: DDoS alarm service.</li>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get The site ID. 
     * @return ZoneId The site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set The site ID.
     * @param ZoneId The site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get The threshold in Mbps. Maximum value: 10. 
     * @return Threshold The threshold in Mbps. Maximum value: 10.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set The threshold in Mbps. Maximum value: 10.
     * @param Threshold The threshold in Mbps. Maximum value: 10.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get The protection entity, which is a proxy ID when layer-4 protection is enabled, or a site name when layer-7 protection is on. 
     * @return Entity The protection entity, which is a proxy ID when layer-4 protection is enabled, or a site name when layer-7 protection is on.
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set The protection entity, which is a proxy ID when layer-4 protection is enabled, or a site name when layer-7 protection is on.
     * @param Entity The protection entity, which is a proxy ID when layer-4 protection is enabled, or a site name when layer-7 protection is on.
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    public ModifyAlarmDefaultThresholdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmDefaultThresholdRequest(ModifyAlarmDefaultThresholdRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Entity", this.Entity);

    }
}

