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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DAGInfo extends AbstractModel {

    /**
    * Query ID.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * DAG type. Only StarRocks is supported currently.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Returned JSON string of the DAG.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Query ID. 
     * @return ID Query ID.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Query ID.
     * @param ID Query ID.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get DAG type. Only StarRocks is supported currently. 
     * @return Type DAG type. Only StarRocks is supported currently.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set DAG type. Only StarRocks is supported currently.
     * @param Type DAG type. Only StarRocks is supported currently.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Returned JSON string of the DAG. 
     * @return Content Returned JSON string of the DAG.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Returned JSON string of the DAG.
     * @param Content Returned JSON string of the DAG.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public DAGInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DAGInfo(DAGInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

