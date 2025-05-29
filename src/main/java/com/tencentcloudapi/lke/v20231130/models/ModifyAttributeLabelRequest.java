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

public class ModifyAttributeLabelRequest extends AbstractModel {

    /**
    * Application ID.
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * Label ID.
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * Label name.
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * Label identifier (abolished).
    */
    @SerializedName("AttrKey")
    @Expose
    private String AttrKey;

    /**
    * Login to user's root account (required in integrator mode).
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * Login to user's sub-account (required in integrator mode).
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * Deleted label value.
    */
    @SerializedName("DeleteLabelBizIds")
    @Expose
    private String [] DeleteLabelBizIds;

    /**
    * Newly-added or edited label.
    */
    @SerializedName("Labels")
    @Expose
    private AttributeLabel [] Labels;

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
     * Get Label ID. 
     * @return AttributeBizId Label ID.
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set Label ID.
     * @param AttributeBizId Label ID.
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get Label name. 
     * @return AttrName Label name.
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set Label name.
     * @param AttrName Label name.
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get Label identifier (abolished). 
     * @return AttrKey Label identifier (abolished).
     */
    public String getAttrKey() {
        return this.AttrKey;
    }

    /**
     * Set Label identifier (abolished).
     * @param AttrKey Label identifier (abolished).
     */
    public void setAttrKey(String AttrKey) {
        this.AttrKey = AttrKey;
    }

    /**
     * Get Login to user's root account (required in integrator mode). 
     * @return LoginUin Login to user's root account (required in integrator mode).
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set Login to user's root account (required in integrator mode).
     * @param LoginUin Login to user's root account (required in integrator mode).
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get Login to user's sub-account (required in integrator mode). 
     * @return LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set Login to user's sub-account (required in integrator mode).
     * @param LoginSubAccountUin Login to user's sub-account (required in integrator mode).
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get Deleted label value. 
     * @return DeleteLabelBizIds Deleted label value.
     */
    public String [] getDeleteLabelBizIds() {
        return this.DeleteLabelBizIds;
    }

    /**
     * Set Deleted label value.
     * @param DeleteLabelBizIds Deleted label value.
     */
    public void setDeleteLabelBizIds(String [] DeleteLabelBizIds) {
        this.DeleteLabelBizIds = DeleteLabelBizIds;
    }

    /**
     * Get Newly-added or edited label. 
     * @return Labels Newly-added or edited label.
     */
    public AttributeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Newly-added or edited label.
     * @param Labels Newly-added or edited label.
     */
    public void setLabels(AttributeLabel [] Labels) {
        this.Labels = Labels;
    }

    public ModifyAttributeLabelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAttributeLabelRequest(ModifyAttributeLabelRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.AttrKey != null) {
            this.AttrKey = new String(source.AttrKey);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.DeleteLabelBizIds != null) {
            this.DeleteLabelBizIds = new String[source.DeleteLabelBizIds.length];
            for (int i = 0; i < source.DeleteLabelBizIds.length; i++) {
                this.DeleteLabelBizIds[i] = new String(source.DeleteLabelBizIds[i]);
            }
        }
        if (source.Labels != null) {
            this.Labels = new AttributeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AttributeLabel(source.Labels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamSimple(map, prefix + "AttrKey", this.AttrKey);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamArraySimple(map, prefix + "DeleteLabelBizIds.", this.DeleteLabelBizIds);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);

    }
}

