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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOrganizationNodeRequest extends AbstractModel{

    /**
    * Parent node ID, which can be obtained through the `DescribeOrganizationNodes` API.
    */
    @SerializedName("ParentNodeId")
    @Expose
    private Long ParentNodeId;

    /**
    * Node name, which can contain up to 40 letters, digits, and symbols `+@&._[]-`.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Parent node ID, which can be obtained through the `DescribeOrganizationNodes` API. 
     * @return ParentNodeId Parent node ID, which can be obtained through the `DescribeOrganizationNodes` API.
     */
    public Long getParentNodeId() {
        return this.ParentNodeId;
    }

    /**
     * Set Parent node ID, which can be obtained through the `DescribeOrganizationNodes` API.
     * @param ParentNodeId Parent node ID, which can be obtained through the `DescribeOrganizationNodes` API.
     */
    public void setParentNodeId(Long ParentNodeId) {
        this.ParentNodeId = ParentNodeId;
    }

    /**
     * Get Node name, which can contain up to 40 letters, digits, and symbols `+@&._[]-`. 
     * @return Name Node name, which can contain up to 40 letters, digits, and symbols `+@&._[]-`.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Node name, which can contain up to 40 letters, digits, and symbols `+@&._[]-`.
     * @param Name Node name, which can contain up to 40 letters, digits, and symbols `+@&._[]-`.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public AddOrganizationNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrganizationNodeRequest(AddOrganizationNodeRequest source) {
        if (source.ParentNodeId != null) {
            this.ParentNodeId = new Long(source.ParentNodeId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentNodeId", this.ParentNodeId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

