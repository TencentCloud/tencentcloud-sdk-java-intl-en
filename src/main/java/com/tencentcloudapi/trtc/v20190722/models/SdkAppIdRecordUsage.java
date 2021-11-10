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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SdkAppIdRecordUsage extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * Durations for the period queried
    */
    @SerializedName("Usages")
    @Expose
    private RecordUsage [] Usages;

    /**
     * Get Application ID 
     * @return SdkAppId Application ID
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID
     * @param SdkAppId Application ID
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Durations for the period queried 
     * @return Usages Durations for the period queried
     */
    public RecordUsage [] getUsages() {
        return this.Usages;
    }

    /**
     * Set Durations for the period queried
     * @param Usages Durations for the period queried
     */
    public void setUsages(RecordUsage [] Usages) {
        this.Usages = Usages;
    }

    public SdkAppIdRecordUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SdkAppIdRecordUsage(SdkAppIdRecordUsage source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.Usages != null) {
            this.Usages = new RecordUsage[source.Usages.length];
            for (int i = 0; i < source.Usages.length; i++) {
                this.Usages[i] = new RecordUsage(source.Usages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "Usages.", this.Usages);

    }
}

