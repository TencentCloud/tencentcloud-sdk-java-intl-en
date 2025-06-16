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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckAttributeLabelReferRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Log in to user's root account (required in integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Log in to user's sub-account (required in integrator mode).
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * Attribute label.
    */
    @SerializedName("LabelBizId")
    @Expose
    private String LabelBizId;

    /**
    * Attribute ID.
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String [] AttributeBizId;

    /**
     * Get Application ID. 
     * @return BotBizId Application ID.
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set Application ID.
     * @param BotBizId Application ID.
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get Log in to user's root account (required in integrator mode). 
     * @return LoginUin Log in to user's root account (required in integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Log in to user's root account (required in integrator mode).
     * @param LoginUin Log in to user's root account (required in integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Log in to user's sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Log in to user's sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Log in to user's sub-account (required in integrator mode).
     * @param LoginSubAccountUin Log in to user's sub-account (required in integrator mode).
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get Attribute label. 
     * @return LabelBizId Attribute label.
     */
    public String getLabelBizId() {
        return this.LabelBizId;
    }

    /**
     * Set Attribute label.
     * @param LabelBizId Attribute label.
     */
    public void setLabelBizId(String LabelBizId) {
        this.LabelBizId = LabelBizId;
    }

    /**
     * Get Attribute ID. 
     * @return AttributeBizId Attribute ID.
     */
    public String [] getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set Attribute ID.
     * @param AttributeBizId Attribute ID.
     */
    public void setAttributeBizId(String [] AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    public CheckAttributeLabelReferRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAttributeLabelReferRequest(CheckAttributeLabelReferRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.LabelBizId != null) {
            this.LabelBizId = new String(source.LabelBizId);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String[source.AttributeBizId.length];
            for (int i = 0; i < source.AttributeBizId.length; i++) {
                this.AttributeBizId[i] = new String(source.AttributeBizId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "LabelBizId", this.LabelBizId);
        this.setParamArraySimple(map, prefix + "AttributeBizId.", this.AttributeBizId);

    }
}

