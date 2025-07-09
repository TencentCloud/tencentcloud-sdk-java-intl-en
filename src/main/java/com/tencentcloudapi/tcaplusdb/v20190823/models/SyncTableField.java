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

public class SyncTableField extends AbstractModel {

    /**
    * Field name of TcaplusDB table
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Field name of the target cache table
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
     * Get Field name of TcaplusDB table 
     * @return SourceName Field name of TcaplusDB table
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Field name of TcaplusDB table
     * @param SourceName Field name of TcaplusDB table
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Field name of the target cache table 
     * @return TargetName Field name of the target cache table
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set Field name of the target cache table
     * @param TargetName Field name of the target cache table
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    public SyncTableField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncTableField(SyncTableField source) {
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);

    }
}

