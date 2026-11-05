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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAccountsRequest extends AbstractModel {

    /**
    * <p>Number of returned results. If the returned results are truncated after reaching the MaxItems limit, the response parameter IsTruncated will be equal to true.</p><p>Value range: [1, 100]</p>
    */
    @SerializedName("MaxItems")
    @Expose
    private Long MaxItems;

    /**
    * <p>When the return result of the request is truncated, you can use Marker to get the content after the current truncation position.</p>
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * <p>Type of user</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: ordinary sub-user</li><li>CICUser: CIC sub-user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity sub-user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li></ul>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
     * Get <p>Number of returned results. If the returned results are truncated after reaching the MaxItems limit, the response parameter IsTruncated will be equal to true.</p><p>Value range: [1, 100]</p> 
     * @return MaxItems <p>Number of returned results. If the returned results are truncated after reaching the MaxItems limit, the response parameter IsTruncated will be equal to true.</p><p>Value range: [1, 100]</p>
     */
    public Long getMaxItems() {
        return this.MaxItems;
    }

    /**
     * Set <p>Number of returned results. If the returned results are truncated after reaching the MaxItems limit, the response parameter IsTruncated will be equal to true.</p><p>Value range: [1, 100]</p>
     * @param MaxItems <p>Number of returned results. If the returned results are truncated after reaching the MaxItems limit, the response parameter IsTruncated will be equal to true.</p><p>Value range: [1, 100]</p>
     */
    public void setMaxItems(Long MaxItems) {
        this.MaxItems = MaxItems;
    }

    /**
     * Get <p>When the return result of the request is truncated, you can use Marker to get the content after the current truncation position.</p> 
     * @return Marker <p>When the return result of the request is truncated, you can use Marker to get the content after the current truncation position.</p>
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set <p>When the return result of the request is truncated, you can use Marker to get the content after the current truncation position.</p>
     * @param Marker <p>When the return result of the request is truncated, you can use Marker to get the content after the current truncation position.</p>
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get <p>Type of user</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: ordinary sub-user</li><li>CICUser: CIC sub-user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity sub-user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li></ul> 
     * @return UserType <p>Type of user</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: ordinary sub-user</li><li>CICUser: CIC sub-user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity sub-user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li></ul>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>Type of user</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: ordinary sub-user</li><li>CICUser: CIC sub-user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity sub-user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li></ul>
     * @param UserType <p>Type of user</p><p>Enumeration values:</p><ul><li>Owner: root account</li><li>SubUser: ordinary sub-user</li><li>CICUser: CIC sub-user</li><li>WechatCorpUser: WeCom sub-user</li><li>AgentIdentity: AgentIdentity sub-user</li><li>Collaborator: collaborator</li><li>MessageReceiver: message recipient</li></ul>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public ListAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAccountsRequest(ListAccountsRequest source) {
        if (source.MaxItems != null) {
            this.MaxItems = new Long(source.MaxItems);
        }
        if (source.Marker != null) {
            this.Marker = new String(source.Marker);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxItems", this.MaxItems);
        this.setParamSimple(map, prefix + "Marker", this.Marker);
        this.setParamSimple(map, prefix + "UserType", this.UserType);

    }
}

