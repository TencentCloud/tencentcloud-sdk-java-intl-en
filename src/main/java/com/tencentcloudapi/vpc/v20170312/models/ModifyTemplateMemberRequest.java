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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTemplateMemberRequest extends AbstractModel {

    /**
    * Parameter template instance ID, which can be the instance ID of a parameter template of the following four types: IP address, protocol port, IP address group, and protocol port group.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Information on the parameter template to be modified. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of TemplateMember, and the input parameter length should be consistent with that of TemplateMember.
    */
    @SerializedName("OriginalTemplateMember")
    @Expose
    private MemberInfo [] OriginalTemplateMember;

    /**
    * New parameter template information. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of OriginalTemplateMember, and the input parameter length should be consistent with that of OriginalTemplateMember.
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
     * Get Information on the parameter template to be modified. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of TemplateMember, and the input parameter length should be consistent with that of TemplateMember. 
     * @return OriginalTemplateMember Information on the parameter template to be modified. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of TemplateMember, and the input parameter length should be consistent with that of TemplateMember.
     */
    public MemberInfo [] getOriginalTemplateMember() {
        return this.OriginalTemplateMember;
    }

    /**
     * Set Information on the parameter template to be modified. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of TemplateMember, and the input parameter length should be consistent with that of TemplateMember.
     * @param OriginalTemplateMember Information on the parameter template to be modified. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of TemplateMember, and the input parameter length should be consistent with that of TemplateMember.
     */
    public void setOriginalTemplateMember(MemberInfo [] OriginalTemplateMember) {
        this.OriginalTemplateMember = OriginalTemplateMember;
    }

    /**
     * Get New parameter template information. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of OriginalTemplateMember, and the input parameter length should be consistent with that of OriginalTemplateMember. 
     * @return TemplateMember New parameter template information. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of OriginalTemplateMember, and the input parameter length should be consistent with that of OriginalTemplateMember.
     */
    public MemberInfo [] getTemplateMember() {
        return this.TemplateMember;
    }

    /**
     * Set New parameter template information. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of OriginalTemplateMember, and the input parameter length should be consistent with that of OriginalTemplateMember.
     * @param TemplateMember New parameter template information. The template can be of the following four types: IP address, protocol port, IP address group, and protocol port group. The type should be consistent with that of the template specified by the TemplateId parameter. The parameter sequence should be the same as that of OriginalTemplateMember, and the input parameter length should be consistent with that of OriginalTemplateMember.
     */
    public void setTemplateMember(MemberInfo [] TemplateMember) {
        this.TemplateMember = TemplateMember;
    }

    public ModifyTemplateMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTemplateMemberRequest(ModifyTemplateMemberRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.OriginalTemplateMember != null) {
            this.OriginalTemplateMember = new MemberInfo[source.OriginalTemplateMember.length];
            for (int i = 0; i < source.OriginalTemplateMember.length; i++) {
                this.OriginalTemplateMember[i] = new MemberInfo(source.OriginalTemplateMember[i]);
            }
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
        this.setParamArrayObj(map, prefix + "OriginalTemplateMember.", this.OriginalTemplateMember);
        this.setParamArrayObj(map, prefix + "TemplateMember.", this.TemplateMember);

    }
}

