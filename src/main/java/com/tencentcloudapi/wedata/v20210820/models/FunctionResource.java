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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionResource extends AbstractModel {

    /**
    * Resource PathNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * NoNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Resource Unique Identifier
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Resource MD5 Value
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * Default is HDFS
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Resource PathNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Path Resource PathNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Resource PathNote: This field may return null, indicating that no valid value can be obtained.
     * @param Path Resource PathNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get NoNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set NoNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name NoNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Resource Unique Identifier 
     * @return Id Resource Unique Identifier
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource Unique Identifier
     * @param Id Resource Unique Identifier
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Resource MD5 Value
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Md5 Resource MD5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set Resource MD5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Md5 Resource MD5 Value
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get Default is HDFS
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Type Default is HDFS
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Default is HDFS
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Type Default is HDFS
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public FunctionResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionResource(FunctionResource source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

