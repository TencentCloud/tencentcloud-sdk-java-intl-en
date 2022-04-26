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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrgNodeRequest extends AbstractModel{

    /**
    * Organization node ID, which is globally unique and can contain up to 64 characters. If this parameter is left empty, the information of the root organization node will be read by default.
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * Whether to read the information of its sub-nodes. When this parameter is left empty or specified as `false`, only the information of the current organization node will be read by default. When it is specified as `true`, the information of the current organization node and its level-1 sub-nodes will be read.
    */
    @SerializedName("IncludeOrgNodeChildInfo")
    @Expose
    private Boolean IncludeOrgNodeChildInfo;

    /**
     * Get Organization node ID, which is globally unique and can contain up to 64 characters. If this parameter is left empty, the information of the root organization node will be read by default. 
     * @return OrgNodeId Organization node ID, which is globally unique and can contain up to 64 characters. If this parameter is left empty, the information of the root organization node will be read by default.
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set Organization node ID, which is globally unique and can contain up to 64 characters. If this parameter is left empty, the information of the root organization node will be read by default.
     * @param OrgNodeId Organization node ID, which is globally unique and can contain up to 64 characters. If this parameter is left empty, the information of the root organization node will be read by default.
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get Whether to read the information of its sub-nodes. When this parameter is left empty or specified as `false`, only the information of the current organization node will be read by default. When it is specified as `true`, the information of the current organization node and its level-1 sub-nodes will be read. 
     * @return IncludeOrgNodeChildInfo Whether to read the information of its sub-nodes. When this parameter is left empty or specified as `false`, only the information of the current organization node will be read by default. When it is specified as `true`, the information of the current organization node and its level-1 sub-nodes will be read.
     */
    public Boolean getIncludeOrgNodeChildInfo() {
        return this.IncludeOrgNodeChildInfo;
    }

    /**
     * Set Whether to read the information of its sub-nodes. When this parameter is left empty or specified as `false`, only the information of the current organization node will be read by default. When it is specified as `true`, the information of the current organization node and its level-1 sub-nodes will be read.
     * @param IncludeOrgNodeChildInfo Whether to read the information of its sub-nodes. When this parameter is left empty or specified as `false`, only the information of the current organization node will be read by default. When it is specified as `true`, the information of the current organization node and its level-1 sub-nodes will be read.
     */
    public void setIncludeOrgNodeChildInfo(Boolean IncludeOrgNodeChildInfo) {
        this.IncludeOrgNodeChildInfo = IncludeOrgNodeChildInfo;
    }

    public DescribeOrgNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrgNodeRequest(DescribeOrgNodeRequest source) {
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.IncludeOrgNodeChildInfo != null) {
            this.IncludeOrgNodeChildInfo = new Boolean(source.IncludeOrgNodeChildInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "IncludeOrgNodeChildInfo", this.IncludeOrgNodeChildInfo);

    }
}

