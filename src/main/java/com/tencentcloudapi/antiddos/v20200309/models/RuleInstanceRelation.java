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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInstanceRelation extends AbstractModel {

    /**
    * Instance IP
    */
    @SerializedName("EipList")
    @Expose
    private String [] EipList;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance CNAME
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
     * Get Instance IP 
     * @return EipList Instance IP
     */
    public String [] getEipList() {
        return this.EipList;
    }

    /**
     * Set Instance IP
     * @param EipList Instance IP
     */
    public void setEipList(String [] EipList) {
        this.EipList = EipList;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance CNAME 
     * @return Cname Instance CNAME
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set Instance CNAME
     * @param Cname Instance CNAME
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public RuleInstanceRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInstanceRelation(RuleInstanceRelation source) {
        if (source.EipList != null) {
            this.EipList = new String[source.EipList.length];
            for (int i = 0; i < source.EipList.length; i++) {
                this.EipList[i] = new String(source.EipList[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EipList.", this.EipList);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cname", this.Cname);

    }
}

