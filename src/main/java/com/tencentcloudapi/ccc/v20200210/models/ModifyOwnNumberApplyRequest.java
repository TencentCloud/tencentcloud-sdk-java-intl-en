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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOwnNumberApplyRequest extends AbstractModel {

    /**
    * Application id (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Circuit-Related parameters.
    */
    @SerializedName("DetailList")
    @Expose
    private OwnNumberApplyDetailItem [] DetailList;

    /**
    * Approval id.
    */
    @SerializedName("ApplyId")
    @Expose
    private Long ApplyId;

    /**
    * Prefix for sending numbers.
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
     * Get Application id (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application id (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Circuit-Related parameters. 
     * @return DetailList Circuit-Related parameters.
     */
    public OwnNumberApplyDetailItem [] getDetailList() {
        return this.DetailList;
    }

    /**
     * Set Circuit-Related parameters.
     * @param DetailList Circuit-Related parameters.
     */
    public void setDetailList(OwnNumberApplyDetailItem [] DetailList) {
        this.DetailList = DetailList;
    }

    /**
     * Get Approval id. 
     * @return ApplyId Approval id.
     */
    public Long getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set Approval id.
     * @param ApplyId Approval id.
     */
    public void setApplyId(Long ApplyId) {
        this.ApplyId = ApplyId;
    }

    /**
     * Get Prefix for sending numbers. 
     * @return Prefix Prefix for sending numbers.
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set Prefix for sending numbers.
     * @param Prefix Prefix for sending numbers.
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    public ModifyOwnNumberApplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwnNumberApplyRequest(ModifyOwnNumberApplyRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.DetailList != null) {
            this.DetailList = new OwnNumberApplyDetailItem[source.DetailList.length];
            for (int i = 0; i < source.DetailList.length; i++) {
                this.DetailList[i] = new OwnNumberApplyDetailItem(source.DetailList[i]);
            }
        }
        if (source.ApplyId != null) {
            this.ApplyId = new Long(source.ApplyId);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArrayObj(map, prefix + "DetailList.", this.DetailList);
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);

    }
}

