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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Identity extends AbstractModel {

    /**
    * The account identifier.
    */
    @SerializedName("AccountIdentifier")
    @Expose
    private String AccountIdentifier;

    /**
    * The chain ID.
    */
    @SerializedName("ChainID")
    @Expose
    private String ChainID;

    /**
    * The DID.
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * The group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
     * Get The account identifier. 
     * @return AccountIdentifier The account identifier.
     */
    public String getAccountIdentifier() {
        return this.AccountIdentifier;
    }

    /**
     * Set The account identifier.
     * @param AccountIdentifier The account identifier.
     */
    public void setAccountIdentifier(String AccountIdentifier) {
        this.AccountIdentifier = AccountIdentifier;
    }

    /**
     * Get The chain ID. 
     * @return ChainID The chain ID.
     */
    public String getChainID() {
        return this.ChainID;
    }

    /**
     * Set The chain ID.
     * @param ChainID The chain ID.
     */
    public void setChainID(String ChainID) {
        this.ChainID = ChainID;
    }

    /**
     * Get The DID. 
     * @return Did The DID.
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set The DID.
     * @param Did The DID.
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The group name. 
     * @return GroupName The group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set The group name.
     * @param GroupName The group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public Identity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Identity(Identity source) {
        if (source.AccountIdentifier != null) {
            this.AccountIdentifier = new String(source.AccountIdentifier);
        }
        if (source.ChainID != null) {
            this.ChainID = new String(source.ChainID);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountIdentifier", this.AccountIdentifier);
        this.setParamSimple(map, prefix + "ChainID", this.ChainID);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);

    }
}

