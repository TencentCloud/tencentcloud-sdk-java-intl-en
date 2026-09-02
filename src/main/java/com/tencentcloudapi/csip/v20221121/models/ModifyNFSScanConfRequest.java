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

public class ModifyNFSScanConfRequest extends AbstractModel {

    /**
    * <p>Whether NFS scan is enabled. 0: No, 1: Yes, 9: Not set. Same as 0, it is not enabled.</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

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
    * <p>Record ID, which is 0 when projects are added</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>List of selected quuid configurations</p>
    */
    @SerializedName("IncludeQuuid")
    @Expose
    private String [] IncludeQuuid;

    /**
    * <p>List of unselected quuid configurations</p>
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
     * Get <p>Whether NFS scan is enabled. 0: No, 1: Yes, 9: Not set. Same as 0, it is not enabled.</p> 
     * @return Enable <p>Whether NFS scan is enabled. 0: No, 1: Yes, 9: Not set. Same as 0, it is not enabled.</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>Whether NFS scan is enabled. 0: No, 1: Yes, 9: Not set. Same as 0, it is not enabled.</p>
     * @param Enable <p>Whether NFS scan is enabled. 0: No, 1: Yes, 9: Not set. Same as 0, it is not enabled.</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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
     * Get <p>Record ID, which is 0 when projects are added</p> 
     * @return Id <p>Record ID, which is 0 when projects are added</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Record ID, which is 0 when projects are added</p>
     * @param Id <p>Record ID, which is 0 when projects are added</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>List of selected quuid configurations</p> 
     * @return IncludeQuuid <p>List of selected quuid configurations</p>
     */
    public String [] getIncludeQuuid() {
        return this.IncludeQuuid;
    }

    /**
     * Set <p>List of selected quuid configurations</p>
     * @param IncludeQuuid <p>List of selected quuid configurations</p>
     */
    public void setIncludeQuuid(String [] IncludeQuuid) {
        this.IncludeQuuid = IncludeQuuid;
    }

    /**
     * Get <p>List of unselected quuid configurations</p> 
     * @return ExcludeQuuid <p>List of unselected quuid configurations</p>
     */
    public String [] getExcludeQuuid() {
        return this.ExcludeQuuid;
    }

    /**
     * Set <p>List of unselected quuid configurations</p>
     * @param ExcludeQuuid <p>List of unselected quuid configurations</p>
     */
    public void setExcludeQuuid(String [] ExcludeQuuid) {
        this.ExcludeQuuid = ExcludeQuuid;
    }

    public ModifyNFSScanConfRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNFSScanConfRequest(ModifyNFSScanConfRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
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
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "IncludeQuuid.", this.IncludeQuuid);
        this.setParamArraySimple(map, prefix + "ExcludeQuuid.", this.ExcludeQuuid);

    }
}

