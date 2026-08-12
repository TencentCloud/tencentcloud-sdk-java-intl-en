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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountBriefInfo extends AbstractModel {

    /**
    * <p>Account AppID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Account nickname</p>
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * <p>account Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get <p>Account AppID</p> 
     * @return AppID <p>Account AppID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>Account AppID</p>
     * @param AppID <p>Account AppID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Account nickname</p> 
     * @return Nick <p>Account nickname</p>
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set <p>Account nickname</p>
     * @param Nick <p>Account nickname</p>
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get <p>account Uin</p> 
     * @return Uin <p>account Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>account Uin</p>
     * @param Uin <p>account Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public AccountBriefInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountBriefInfo(AccountBriefInfo source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

