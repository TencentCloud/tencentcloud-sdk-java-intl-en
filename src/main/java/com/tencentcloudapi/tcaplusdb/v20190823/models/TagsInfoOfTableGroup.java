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

public class TagsInfoOfTableGroup extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Table group ID
    */
    @SerializedName("TableGroupId")
    @Expose
    private String TableGroupId;

    /**
    * Tag information
    */
    @SerializedName("Tags")
    @Expose
    private TagInfoUnit [] Tags;

    /**
    * Error message
    */
    @SerializedName("Error")
    @Expose
    private ErrorInfo Error;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Table group ID 
     * @return TableGroupId Table group ID
     */
    public String getTableGroupId() {
        return this.TableGroupId;
    }

    /**
     * Set Table group ID
     * @param TableGroupId Table group ID
     */
    public void setTableGroupId(String TableGroupId) {
        this.TableGroupId = TableGroupId;
    }

    /**
     * Get Tag information 
     * @return Tags Tag information
     */
    public TagInfoUnit [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag information
     * @param Tags Tag information
     */
    public void setTags(TagInfoUnit [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Error message 
     * @return Error Error message
     */
    public ErrorInfo getError() {
        return this.Error;
    }

    /**
     * Set Error message
     * @param Error Error message
     */
    public void setError(ErrorInfo Error) {
        this.Error = Error;
    }

    public TagsInfoOfTableGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagsInfoOfTableGroup(TagsInfoOfTableGroup source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.TableGroupId != null) {
            this.TableGroupId = new String(source.TableGroupId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfoUnit[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfoUnit(source.Tags[i]);
            }
        }
        if (source.Error != null) {
            this.Error = new ErrorInfo(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TableGroupId", this.TableGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Error.", this.Error);

    }
}

