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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTemplateMemberRequest extends AbstractModel {

    /**
    * Parameter template instance ID, which can be the instance ID of a parameter template of the following four types: IP address, protocol port, IP address group, and protocol port group.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Information on the parameter template to be added. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter.
    */
    @SerializedName("TemplateMember")
    @Expose
    private MemberInfo [] TemplateMember;

    /**
     * Get Parameter template instance ID, which can be the instance ID of a parameter template of the following four types: IP address, protocol port, IP address group, and protocol port group. 
     * @return TemplateId Parameter template instance ID, which can be the instance ID of a parameter template of the following four types: IP address, protocol port, IP address group, and protocol port group.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Parameter template instance ID, which can be the instance ID of a parameter template of the following four types: IP address, protocol port, IP address group, and protocol port group.
     * @param TemplateId Parameter template instance ID, which can be the instance ID of a parameter template of the following four types: IP address, protocol port, IP address group, and protocol port group.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Information on the parameter template to be added. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. 
     * @return TemplateMember Information on the parameter template to be added. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter.
     */
    public MemberInfo [] getTemplateMember() {
        return this.TemplateMember;
    }

    /**
     * Set Information on the parameter template to be added. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter.
     * @param TemplateMember Information on the parameter template to be added. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter.
     */
    public void setTemplateMember(MemberInfo [] TemplateMember) {
        this.TemplateMember = TemplateMember;
    }

    public DeleteTemplateMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTemplateMemberRequest(DeleteTemplateMemberRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateMember != null) {
            this.TemplateMember = new MemberInfo[source.TemplateMember.length];
            for (int i = 0; i < source.TemplateMember.length; i++) {
                this.TemplateMember[i] = new MemberInfo(source.TemplateMember[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArrayObj(map, prefix + "TemplateMember.", this.TemplateMember);

    }
}

