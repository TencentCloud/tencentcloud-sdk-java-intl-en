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

public class CreateDspmIdentifyLevelGroupRequest extends AbstractModel {

    /**
    * <p>Hierarchy group name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>None</p>
    */
    @SerializedName("LevelItems")
    @Expose
    private DspmAddIdentifyLevelItem [] LevelItems;

    /**
    * <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
    */
    @SerializedName("OperationSource")
    @Expose
    private String OperationSource;

    /**
     * Get <p>Hierarchy group name</p> 
     * @return Name <p>Hierarchy group name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Hierarchy group name</p>
     * @param Name <p>Hierarchy group name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>None</p> 
     * @return LevelItems <p>None</p>
     */
    public DspmAddIdentifyLevelItem [] getLevelItems() {
        return this.LevelItems;
    }

    /**
     * Set <p>None</p>
     * @param LevelItems <p>None</p>
     */
    public void setLevelItems(DspmAddIdentifyLevelItem [] LevelItems) {
        this.LevelItems = LevelItems;
    }

    /**
     * Get <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p> 
     * @return OperationSource <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
     */
    public String getOperationSource() {
        return this.OperationSource;
    }

    /**
     * Set <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
     * @param OperationSource <p>Operation source: empty/dspm=Database risk monitoring entry, cos=Object storage risk monitoring entry</p>
     */
    public void setOperationSource(String OperationSource) {
        this.OperationSource = OperationSource;
    }

    public CreateDspmIdentifyLevelGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmIdentifyLevelGroupRequest(CreateDspmIdentifyLevelGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LevelItems != null) {
            this.LevelItems = new DspmAddIdentifyLevelItem[source.LevelItems.length];
            for (int i = 0; i < source.LevelItems.length; i++) {
                this.LevelItems[i] = new DspmAddIdentifyLevelItem(source.LevelItems[i]);
            }
        }
        if (source.OperationSource != null) {
            this.OperationSource = new String(source.OperationSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "LevelItems.", this.LevelItems);
        this.setParamSimple(map, prefix + "OperationSource", this.OperationSource);

    }
}

