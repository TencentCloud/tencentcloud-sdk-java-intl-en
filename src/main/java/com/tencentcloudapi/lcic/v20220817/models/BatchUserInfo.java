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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchUserInfo extends AbstractModel {

    /**
    * The SDKAppID assigned by LCIC.

    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
     * Get The SDKAppID assigned by LCIC.
 
     * @return SdkAppId The SDKAppID assigned by LCIC.

     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set The SDKAppID assigned by LCIC.

     * @param SdkAppId The SDKAppID assigned by LCIC.

     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OriginId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OriginId 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    public BatchUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchUserInfo(BatchUserInfo source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);

    }
}

