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

public class StartOrModifyProcessDaemonRequest extends AbstractModel {

    /**
    * <p>Operation source 0   Host Page 1   Client Settings Page</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>Enable scope 0 Selected host 1 All hosts</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Group account member id.</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Selected quuid set</p>
    */
    @SerializedName("IncludeQuuid")
    @Expose
    private String [] IncludeQuuid;

    /**
    * <p>Excluded quuid set</p>
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
     * Get <p>Operation source 0   Host Page 1   Client Settings Page</p> 
     * @return From <p>Operation source 0   Host Page 1   Client Settings Page</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>Operation source 0   Host Page 1   Client Settings Page</p>
     * @param From <p>Operation source 0   Host Page 1   Client Settings Page</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>Enable scope 0 Selected host 1 All hosts</p> 
     * @return Scope <p>Enable scope 0 Selected host 1 All hosts</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Enable scope 0 Selected host 1 All hosts</p>
     * @param Scope <p>Enable scope 0 Selected host 1 All hosts</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Group account member id.</p> 
     * @return MemberId <p>Group account member id.</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id.</p>
     * @param MemberId <p>Group account member id.</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Selected quuid set</p> 
     * @return IncludeQuuid <p>Selected quuid set</p>
     */
    public String [] getIncludeQuuid() {
        return this.IncludeQuuid;
    }

    /**
     * Set <p>Selected quuid set</p>
     * @param IncludeQuuid <p>Selected quuid set</p>
     */
    public void setIncludeQuuid(String [] IncludeQuuid) {
        this.IncludeQuuid = IncludeQuuid;
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

    public StartOrModifyProcessDaemonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartOrModifyProcessDaemonRequest(StartOrModifyProcessDaemonRequest source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.IncludeQuuid != null) {
            this.IncludeQuuid = new String[source.IncludeQuuid.length];
            for (int i = 0; i < source.IncludeQuuid.length; i++) {
                this.IncludeQuuid[i] = new String(source.IncludeQuuid[i]);
            }
        }
        if (source.ExcludeQuuid != null) {
            this.ExcludeQuuid = new String[source.ExcludeQuuid.length];
            for (int i = 0; i < source.ExcludeQuuid.length; i++) {
                this.ExcludeQuuid[i] = new String(source.ExcludeQuuid[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "IncludeQuuid.", this.IncludeQuuid);
        this.setParamArraySimple(map, prefix + "ExcludeQuuid.", this.ExcludeQuuid);

    }
}

