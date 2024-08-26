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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoveOrganizationNodeMembersRequest extends AbstractModel {

    /**
    * Organization node ID, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * Uin list of the members.
    */
    @SerializedName("MemberUin")
    @Expose
    private Long [] MemberUin;

    /**
     * Get Organization node ID, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1). 
     * @return NodeId Organization node ID, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Organization node ID, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
     * @param NodeId Organization node ID, which can be obtained through [DescribeOrganizationNodes](https://intl.cloud.tencent.com/document/product/850/82926?from_cn_redirect=1).
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Uin list of the members. 
     * @return MemberUin Uin list of the members.
     */
    public Long [] getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set Uin list of the members.
     * @param MemberUin Uin list of the members.
     */
    public void setMemberUin(Long [] MemberUin) {
        this.MemberUin = MemberUin;
    }

    public MoveOrganizationNodeMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MoveOrganizationNodeMembersRequest(MoveOrganizationNodeMembersRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long[source.MemberUin.length];
            for (int i = 0; i < source.MemberUin.length; i++) {
                this.MemberUin[i] = new Long(source.MemberUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamArraySimple(map, prefix + "MemberUin.", this.MemberUin);

    }
}

