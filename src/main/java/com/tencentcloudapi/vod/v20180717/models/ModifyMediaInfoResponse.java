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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMediaInfoResponse extends AbstractModel {

    /**
    * URL of new video cover.
* Note: this returned value is valid only if the request carries `CoverData`.*
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Added subtitle information
    */
    @SerializedName("AddedSubtitleSet")
    @Expose
    private MediaSubtitleItem [] AddedSubtitleSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get URL of new video cover.
* Note: this returned value is valid only if the request carries `CoverData`.* 
     * @return CoverUrl URL of new video cover.
* Note: this returned value is valid only if the request carries `CoverData`.*
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set URL of new video cover.
* Note: this returned value is valid only if the request carries `CoverData`.*
     * @param CoverUrl URL of new video cover.
* Note: this returned value is valid only if the request carries `CoverData`.*
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Added subtitle information 
     * @return AddedSubtitleSet Added subtitle information
     */
    public MediaSubtitleItem [] getAddedSubtitleSet() {
        return this.AddedSubtitleSet;
    }

    /**
     * Set Added subtitle information
     * @param AddedSubtitleSet Added subtitle information
     */
    public void setAddedSubtitleSet(MediaSubtitleItem [] AddedSubtitleSet) {
        this.AddedSubtitleSet = AddedSubtitleSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ModifyMediaInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMediaInfoResponse(ModifyMediaInfoResponse source) {
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.AddedSubtitleSet != null) {
            this.AddedSubtitleSet = new MediaSubtitleItem[source.AddedSubtitleSet.length];
            for (int i = 0; i < source.AddedSubtitleSet.length; i++) {
                this.AddedSubtitleSet[i] = new MediaSubtitleItem(source.AddedSubtitleSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamArrayObj(map, prefix + "AddedSubtitleSet.", this.AddedSubtitleSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

