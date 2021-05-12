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

public class DeleteDomainRequest extends AbstractModel{

    /**
    * Listener ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Domain name to be deleted
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
When not making a forced deletion, if there are rules bound to origin servers, they will not be deleted.
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get Listener ID 
     * @return ListenerId Listener ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID
     * @param ListenerId Listener ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Domain name to be deleted 
     * @return Domain Domain name to be deleted
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name to be deleted
     * @param Domain Domain name to be deleted
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
When not making a forced deletion, if there are rules bound to origin servers, they will not be deleted. 
     * @return Force Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
When not making a forced deletion, if there are rules bound to origin servers, they will not be deleted.
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
When not making a forced deletion, if there are rules bound to origin servers, they will not be deleted.
     * @param Force Whether to make a forced deletion of forwarding rules that have been bound to origin servers. 0: no; 1: yes.
When not making a forced deletion, if there are rules bound to origin servers, they will not be deleted.
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    public DeleteDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainRequest(DeleteDomainRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Force != null) {
            this.Force = new Long(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

