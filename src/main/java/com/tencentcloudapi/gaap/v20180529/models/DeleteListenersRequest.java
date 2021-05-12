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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteListenersRequest extends AbstractModel{

    /**
    * ID list of listeners to be deleted
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * Whether to allow a forced deletion of listeners that have been bound to origin servers. 1: allowed; 0: not allow.
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
    * Connection group ID; Either this parameter or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Connection ID; Either this parameter or `GroupId` must be set, but you cannot set both.
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get ID list of listeners to be deleted 
     * @return ListenerIds ID list of listeners to be deleted
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * Set ID list of listeners to be deleted
     * @param ListenerIds ID list of listeners to be deleted
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * Get Whether to allow a forced deletion of listeners that have been bound to origin servers. 1: allowed; 0: not allow. 
     * @return Force Whether to allow a forced deletion of listeners that have been bound to origin servers. 1: allowed; 0: not allow.
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set Whether to allow a forced deletion of listeners that have been bound to origin servers. 1: allowed; 0: not allow.
     * @param Force Whether to allow a forced deletion of listeners that have been bound to origin servers. 1: allowed; 0: not allow.
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Get Connection group ID; Either this parameter or `GroupId` must be set, but you cannot set both. 
     * @return GroupId Connection group ID; Either this parameter or `GroupId` must be set, but you cannot set both.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Connection group ID; Either this parameter or `GroupId` must be set, but you cannot set both.
     * @param GroupId Connection group ID; Either this parameter or `GroupId` must be set, but you cannot set both.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Connection ID; Either this parameter or `GroupId` must be set, but you cannot set both. 
     * @return ProxyId Connection ID; Either this parameter or `GroupId` must be set, but you cannot set both.
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set Connection ID; Either this parameter or `GroupId` must be set, but you cannot set both.
     * @param ProxyId Connection ID; Either this parameter or `GroupId` must be set, but you cannot set both.
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    public DeleteListenersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteListenersRequest(DeleteListenersRequest source) {
        if (source.ListenerIds != null) {
            this.ListenerIds = new String[source.ListenerIds.length];
            for (int i = 0; i < source.ListenerIds.length; i++) {
                this.ListenerIds[i] = new String(source.ListenerIds[i]);
            }
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

