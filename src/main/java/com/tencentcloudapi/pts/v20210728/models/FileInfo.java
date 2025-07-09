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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileInfo extends AbstractModel {

    /**
    * Filename

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * File size

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * File type

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Update time

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * File ID

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get Filename

Note: This field may return null, indicating that no valid value is found. 
     * @return Name Filename

Note: This field may return null, indicating that no valid value is found.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Filename

Note: This field may return null, indicating that no valid value is found.
     * @param Name Filename

Note: This field may return null, indicating that no valid value is found.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get File size

Note: This field may return null, indicating that no valid value is found. 
     * @return Size File size

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size

Note: This field may return null, indicating that no valid value is found.
     * @param Size File size

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get File type

Note: This field may return null, indicating that no valid value is found. 
     * @return Type File type

Note: This field may return null, indicating that no valid value is found.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set File type

Note: This field may return null, indicating that no valid value is found.
     * @param Type File type

Note: This field may return null, indicating that no valid value is found.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Update time

Note: This field may return null, indicating that no valid value is found. 
     * @return UpdatedAt Update time

Note: This field may return null, indicating that no valid value is found.
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set Update time

Note: This field may return null, indicating that no valid value is found.
     * @param UpdatedAt Update time

Note: This field may return null, indicating that no valid value is found.
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get File ID

Note: This field may return null, indicating that no valid value is found. 
     * @return FileId File ID

Note: This field may return null, indicating that no valid value is found.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set File ID

Note: This field may return null, indicating that no valid value is found.
     * @param FileId File ID

Note: This field may return null, indicating that no valid value is found.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    public FileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileInfo(FileInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

