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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMachinesLoginTypeRequest extends AbstractModel {

    /**
    * <p>Login method: 0 - original method, 1 - scan code for password-free log-in</p>
    */
    @SerializedName("LoginType")
    @Expose
    private Long LoginType;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>instance_id list (at least one of instance_ids and quuids must be specified)</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>Host quuid list (fill in at least one of instance_ids and quuids)</p>
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * <p>Excluded quuid set</p>
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
    * <p>Enable scope: 0 - selected host, 1 - all hosts</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Operation source:<br>0 Host Page<br>1 Client Settings page<br>2 Security Center page<br>3 LightHouse purchase page<br>4 LightHouse console</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>Request version 0   Original version 1   Policy-based request</p>
    */
    @SerializedName("RequestVersion")
    @Expose
    private Long RequestVersion;

    /**
     * Get <p>Login method: 0 - original method, 1 - scan code for password-free log-in</p> 
     * @return LoginType <p>Login method: 0 - original method, 1 - scan code for password-free log-in</p>
     */
    public Long getLoginType() {
        return this.LoginType;
    }

    /**
     * Set <p>Login method: 0 - original method, 1 - scan code for password-free log-in</p>
     * @param LoginType <p>Login method: 0 - original method, 1 - scan code for password-free log-in</p>
     */
    public void setLoginType(Long LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>instance_id list (at least one of instance_ids and quuids must be specified)</p> 
     * @return InstanceIds <p>instance_id list (at least one of instance_ids and quuids must be specified)</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>instance_id list (at least one of instance_ids and quuids must be specified)</p>
     * @param InstanceIds <p>instance_id list (at least one of instance_ids and quuids must be specified)</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>Host quuid list (fill in at least one of instance_ids and quuids)</p> 
     * @return Quuids <p>Host quuid list (fill in at least one of instance_ids and quuids)</p>
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set <p>Host quuid list (fill in at least one of instance_ids and quuids)</p>
     * @param Quuids <p>Host quuid list (fill in at least one of instance_ids and quuids)</p>
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get <p>Excluded quuid set</p> 
     * @return ExcludeQuuid <p>Excluded quuid set</p>
     */
    public String [] getExcludeQuuid() {
        return this.ExcludeQuuid;
    }

    /**
     * Set <p>Excluded quuid set</p>
     * @param ExcludeQuuid <p>Excluded quuid set</p>
     */
    public void setExcludeQuuid(String [] ExcludeQuuid) {
        this.ExcludeQuuid = ExcludeQuuid;
    }

    /**
     * Get <p>Enable scope: 0 - selected host, 1 - all hosts</p> 
     * @return Scope <p>Enable scope: 0 - selected host, 1 - all hosts</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Enable scope: 0 - selected host, 1 - all hosts</p>
     * @param Scope <p>Enable scope: 0 - selected host, 1 - all hosts</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Operation source:<br>0 Host Page<br>1 Client Settings page<br>2 Security Center page<br>3 LightHouse purchase page<br>4 LightHouse console</p> 
     * @return From <p>Operation source:<br>0 Host Page<br>1 Client Settings page<br>2 Security Center page<br>3 LightHouse purchase page<br>4 LightHouse console</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>Operation source:<br>0 Host Page<br>1 Client Settings page<br>2 Security Center page<br>3 LightHouse purchase page<br>4 LightHouse console</p>
     * @param From <p>Operation source:<br>0 Host Page<br>1 Client Settings page<br>2 Security Center page<br>3 LightHouse purchase page<br>4 LightHouse console</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>Request version 0   Original version 1   Policy-based request</p> 
     * @return RequestVersion <p>Request version 0   Original version 1   Policy-based request</p>
     */
    public Long getRequestVersion() {
        return this.RequestVersion;
    }

    /**
     * Set <p>Request version 0   Original version 1   Policy-based request</p>
     * @param RequestVersion <p>Request version 0   Original version 1   Policy-based request</p>
     */
    public void setRequestVersion(Long RequestVersion) {
        this.RequestVersion = RequestVersion;
    }

    public ModifyMachinesLoginTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMachinesLoginTypeRequest(ModifyMachinesLoginTypeRequest source) {
        if (source.LoginType != null) {
            this.LoginType = new Long(source.LoginType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.ExcludeQuuid != null) {
            this.ExcludeQuuid = new String[source.ExcludeQuuid.length];
            for (int i = 0; i < source.ExcludeQuuid.length; i++) {
                this.ExcludeQuuid[i] = new String(source.ExcludeQuuid[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.RequestVersion != null) {
            this.RequestVersion = new Long(source.RequestVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamArraySimple(map, prefix + "ExcludeQuuid.", this.ExcludeQuuid);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "RequestVersion", this.RequestVersion);

    }
}

