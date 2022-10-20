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

public class ModifyAlarmConfigRequest extends AbstractModel{

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
    * The list of protection entities.
    */
    @SerializedName("EntityList")
    @Expose
    private String [] EntityList;

    /**
    * The alarm threshold. When no value or 0 is passed, the default alarm threshold will be used.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Whether the default alarm threshold is used.
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

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
     * Get The list of protection entities. 
     * @return EntityList The list of protection entities.
     */
    public String [] getEntityList() {
        return this.EntityList;
    }

    /**
     * Set The list of protection entities.
     * @param EntityList The list of protection entities.
     */
    public void setEntityList(String [] EntityList) {
        this.EntityList = EntityList;
    }

    /**
     * Get The alarm threshold. When no value or 0 is passed, the default alarm threshold will be used. 
     * @return Threshold The alarm threshold. When no value or 0 is passed, the default alarm threshold will be used.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set The alarm threshold. When no value or 0 is passed, the default alarm threshold will be used.
     * @param Threshold The alarm threshold. When no value or 0 is passed, the default alarm threshold will be used.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Whether the default alarm threshold is used. 
     * @return IsDefault Whether the default alarm threshold is used.
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set Whether the default alarm threshold is used.
     * @param IsDefault Whether the default alarm threshold is used.
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public ModifyAlarmConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmConfigRequest(ModifyAlarmConfigRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EntityList != null) {
            this.EntityList = new String[source.EntityList.length];
            for (int i = 0; i < source.EntityList.length; i++) {
                this.EntityList[i] = new String(source.EntityList[i]);
            }
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "EntityList.", this.EntityList);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

