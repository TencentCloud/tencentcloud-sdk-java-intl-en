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

public class LogAppCollectPath extends AbstractModel {

    /**
    * <p>Configuration ID.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Collection path.</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Log tag.</p>
    */
    @SerializedName("LogTag")
    @Expose
    private String LogTag;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Modification time.</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get <p>Configuration ID.</p> 
     * @return Id <p>Configuration ID.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Configuration ID.</p>
     * @param Id <p>Configuration ID.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Collection path.</p> 
     * @return Path <p>Collection path.</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Collection path.</p>
     * @param Path <p>Collection path.</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Log tag.</p> 
     * @return LogTag <p>Log tag.</p>
     */
    public String getLogTag() {
        return this.LogTag;
    }

    /**
     * Set <p>Log tag.</p>
     * @param LogTag <p>Log tag.</p>
     */
    public void setLogTag(String LogTag) {
        this.LogTag = LogTag;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreateTime <p>Creation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreateTime <p>Creation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Modification time.</p> 
     * @return ModifyTime <p>Modification time.</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Modification time.</p>
     * @param ModifyTime <p>Modification time.</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public LogAppCollectPath() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogAppCollectPath(LogAppCollectPath source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.LogTag != null) {
            this.LogTag = new String(source.LogTag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "LogTag", this.LogTag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

