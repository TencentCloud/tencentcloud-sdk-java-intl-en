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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUserAppIdResponse extends AbstractModel{

    /**
    * UIN of the current account.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * OwnerUin of the current account.
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * AppId of the current account.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get UIN of the current account. 
     * @return Uin UIN of the current account.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set UIN of the current account.
     * @param Uin UIN of the current account.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get OwnerUin of the current account. 
     * @return OwnerUin OwnerUin of the current account.
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set OwnerUin of the current account.
     * @param OwnerUin OwnerUin of the current account.
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get AppId of the current account. 
     * @return AppId AppId of the current account.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId of the current account.
     * @param AppId AppId of the current account.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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

    public GetUserAppIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUserAppIdResponse(GetUserAppIdResponse source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

