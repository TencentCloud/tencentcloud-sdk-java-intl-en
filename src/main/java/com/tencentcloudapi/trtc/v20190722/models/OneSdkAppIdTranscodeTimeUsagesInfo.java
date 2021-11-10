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

public class OneSdkAppIdTranscodeTimeUsagesInfo extends AbstractModel{

    /**
    * Array of relaying and transcoding durations
    */
    @SerializedName("SdkAppIdTranscodeTimeUsages")
    @Expose
    private SdkAppIdTrtcMcuTranscodeTimeUsage [] SdkAppIdTranscodeTimeUsages;

    /**
    * Number of records returned
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * ID of the application queried. Its value may be an application ID or `total`, which indicates that the total durations of all applications are queried.
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
     * Get Array of relaying and transcoding durations 
     * @return SdkAppIdTranscodeTimeUsages Array of relaying and transcoding durations
     */
    public SdkAppIdTrtcMcuTranscodeTimeUsage [] getSdkAppIdTranscodeTimeUsages() {
        return this.SdkAppIdTranscodeTimeUsages;
    }

    /**
     * Set Array of relaying and transcoding durations
     * @param SdkAppIdTranscodeTimeUsages Array of relaying and transcoding durations
     */
    public void setSdkAppIdTranscodeTimeUsages(SdkAppIdTrtcMcuTranscodeTimeUsage [] SdkAppIdTranscodeTimeUsages) {
        this.SdkAppIdTranscodeTimeUsages = SdkAppIdTranscodeTimeUsages;
    }

    /**
     * Get Number of records returned 
     * @return TotalNum Number of records returned
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set Number of records returned
     * @param TotalNum Number of records returned
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get ID of the application queried. Its value may be an application ID or `total`, which indicates that the total durations of all applications are queried. 
     * @return SdkAppId ID of the application queried. Its value may be an application ID or `total`, which indicates that the total durations of all applications are queried.
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set ID of the application queried. Its value may be an application ID or `total`, which indicates that the total durations of all applications are queried.
     * @param SdkAppId ID of the application queried. Its value may be an application ID or `total`, which indicates that the total durations of all applications are queried.
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public OneSdkAppIdTranscodeTimeUsagesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OneSdkAppIdTranscodeTimeUsagesInfo(OneSdkAppIdTranscodeTimeUsagesInfo source) {
        if (source.SdkAppIdTranscodeTimeUsages != null) {
            this.SdkAppIdTranscodeTimeUsages = new SdkAppIdTrtcMcuTranscodeTimeUsage[source.SdkAppIdTranscodeTimeUsages.length];
            for (int i = 0; i < source.SdkAppIdTranscodeTimeUsages.length; i++) {
                this.SdkAppIdTranscodeTimeUsages[i] = new SdkAppIdTrtcMcuTranscodeTimeUsage(source.SdkAppIdTranscodeTimeUsages[i]);
            }
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SdkAppIdTranscodeTimeUsages.", this.SdkAppIdTranscodeTimeUsages);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

