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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTargetsForPolicyNode extends AbstractModel {

    /**
    * SCP account UIN or node ID.
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Association type. 1: node association; 2: user association.
    */
    @SerializedName("RelatedType")
    @Expose
    private Long RelatedType;

    /**
    * Account or node name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Binding time.
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
     * Get SCP account UIN or node ID. 
     * @return Uin SCP account UIN or node ID.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set SCP account UIN or node ID.
     * @param Uin SCP account UIN or node ID.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Association type. 1: node association; 2: user association. 
     * @return RelatedType Association type. 1: node association; 2: user association.
     */
    public Long getRelatedType() {
        return this.RelatedType;
    }

    /**
     * Set Association type. 1: node association; 2: user association.
     * @param RelatedType Association type. 1: node association; 2: user association.
     */
    public void setRelatedType(Long RelatedType) {
        this.RelatedType = RelatedType;
    }

    /**
     * Get Account or node name. 
     * @return Name Account or node name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Account or node name.
     * @param Name Account or node name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Binding time. 
     * @return AddTime Binding time.
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Binding time.
     * @param AddTime Binding time.
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    public ListTargetsForPolicyNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTargetsForPolicyNode(ListTargetsForPolicyNode source) {
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.RelatedType != null) {
            this.RelatedType = new Long(source.RelatedType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "RelatedType", this.RelatedType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);

    }
}

