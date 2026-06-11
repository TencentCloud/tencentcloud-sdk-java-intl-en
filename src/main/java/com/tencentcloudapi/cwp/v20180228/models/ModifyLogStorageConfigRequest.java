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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLogStorageConfigRequest extends AbstractModel {

    /**
    * Whether to modify the validity period (deprecated).
    */
    @SerializedName("IsModifyPeriod")
    @Expose
    private Boolean IsModifyPeriod;

    /**
    * Storage type: string array
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * Log retention time. The value 3640 indicates that the time is unlimited.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Log storage duration unit: year/month/day
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * Language type
    */
    @SerializedName("MsgLanguage")
    @Expose
    private String MsgLanguage;

    /**
     * Get Whether to modify the validity period (deprecated). 
     * @return IsModifyPeriod Whether to modify the validity period (deprecated).
     */
    public Boolean getIsModifyPeriod() {
        return this.IsModifyPeriod;
    }

    /**
     * Set Whether to modify the validity period (deprecated).
     * @param IsModifyPeriod Whether to modify the validity period (deprecated).
     */
    public void setIsModifyPeriod(Boolean IsModifyPeriod) {
        this.IsModifyPeriod = IsModifyPeriod;
    }

    /**
     * Get Storage type: string array 
     * @return Type Storage type: string array
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set Storage type: string array
     * @param Type Storage type: string array
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get Log retention time. The value 3640 indicates that the time is unlimited. 
     * @return Period Log retention time. The value 3640 indicates that the time is unlimited.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Log retention time. The value 3640 indicates that the time is unlimited.
     * @param Period Log retention time. The value 3640 indicates that the time is unlimited.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Log storage duration unit: year/month/day 
     * @return Granularity Log storage duration unit: year/month/day
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set Log storage duration unit: year/month/day
     * @param Granularity Log storage duration unit: year/month/day
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get Language type 
     * @return MsgLanguage Language type
     */
    public String getMsgLanguage() {
        return this.MsgLanguage;
    }

    /**
     * Set Language type
     * @param MsgLanguage Language type
     */
    public void setMsgLanguage(String MsgLanguage) {
        this.MsgLanguage = MsgLanguage;
    }

    public ModifyLogStorageConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogStorageConfigRequest(ModifyLogStorageConfigRequest source) {
        if (source.IsModifyPeriod != null) {
            this.IsModifyPeriod = new Boolean(source.IsModifyPeriod);
        }
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.MsgLanguage != null) {
            this.MsgLanguage = new String(source.MsgLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsModifyPeriod", this.IsModifyPeriod);
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "MsgLanguage", this.MsgLanguage);

    }
}

