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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTableGroupRequest extends AbstractModel {

    /**
    * ID of the cluster where a table group resides
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Table group name, which can contain up to 32 letters and digits
    */
    @SerializedName("TableGroupName")
    @Expose
    private String TableGroupName;

    /**
    * Table group ID, which can be customized but must be unique in one cluster. If it is not specified, the auto-increment mode will be used.
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Table group tag list
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfoUnit [] ResourceTags;

    /**
     * Get ID of the cluster where a table group resides 
     * @return ClusterId ID of the cluster where a table group resides
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set ID of the cluster where a table group resides
     * @param ClusterId ID of the cluster where a table group resides
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Table group name, which can contain up to 32 letters and digits 
     * @return TableGroupName Table group name, which can contain up to 32 letters and digits
     */
    public String getTableGroupName() {
        return this.TableGroupName;
    }

    /**
     * Set Table group name, which can contain up to 32 letters and digits
     * @param TableGroupName Table group name, which can contain up to 32 letters and digits
     */
    public void setTableGroupName(String TableGroupName) {
        this.TableGroupName = TableGroupName;
    }

    /**
     * Get Table group ID, which can be customized but must be unique in one cluster. If it is not specified, the auto-increment mode will be used. 
     * @return TableGroupId Table group ID, which can be customized but must be unique in one cluster. If it is not specified, the auto-increment mode will be used.
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set Table group ID, which can be customized but must be unique in one cluster. If it is not specified, the auto-increment mode will be used.
     * @param TableGroupId Table group ID, which can be customized but must be unique in one cluster. If it is not specified, the auto-increment mode will be used.
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Table group tag list 
     * @return ResourceTags Table group tag list
     */
    public TagInfoUnit [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set Table group tag list
     * @param ResourceTags Table group tag list
     */
    public void setResourceTags(TagInfoUnit [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    public CreateTableGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTableGroupRequest(CreateTableGroupRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupName != null) {
            this.TableGroupName = new String(source.TableGroupName);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfoUnit[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfoUnit(source.ResourceTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupName", this.TableGroupName);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);

    }
}

