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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DoDirectoryOperationRequest extends AbstractModel {

    /**
    * File system ID. currently, only Turbo series file systems support calling this api. general series file systems (including enhanced) do not support calling.
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * create a directory, equivalent to mkdir.
check: confirm the existence of the directory, equivalent to stat.
move: rename a file or directory, equivalent to mv.
    */
    @SerializedName("OpetationType")
    @Expose
    private String OpetationType;

    /**
    * Absolute path of the directory. recursive creation is enabled by default (if the directory contains non-existent subdirectories, create the corresponding subdirectory first).
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
    * Permission to create directory. if not specified, it defaults to 0755. if OperationType is check, this value is meaningless.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The destination directory name for the mv operation. the path must start with /cfs/.
    */
    @SerializedName("DestPath")
    @Expose
    private String DestPath;

    /**
     * Get File system ID. currently, only Turbo series file systems support calling this api. general series file systems (including enhanced) do not support calling. 
     * @return FileSystemId File system ID. currently, only Turbo series file systems support calling this api. general series file systems (including enhanced) do not support calling.
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set File system ID. currently, only Turbo series file systems support calling this api. general series file systems (including enhanced) do not support calling.
     * @param FileSystemId File system ID. currently, only Turbo series file systems support calling this api. general series file systems (including enhanced) do not support calling.
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get create a directory, equivalent to mkdir.
check: confirm the existence of the directory, equivalent to stat.
move: rename a file or directory, equivalent to mv. 
     * @return OpetationType create a directory, equivalent to mkdir.
check: confirm the existence of the directory, equivalent to stat.
move: rename a file or directory, equivalent to mv.
     */
    public String getOpetationType() {
        return this.OpetationType;
    }

    /**
     * Set create a directory, equivalent to mkdir.
check: confirm the existence of the directory, equivalent to stat.
move: rename a file or directory, equivalent to mv.
     * @param OpetationType create a directory, equivalent to mkdir.
check: confirm the existence of the directory, equivalent to stat.
move: rename a file or directory, equivalent to mv.
     */
    public void setOpetationType(String OpetationType) {
        this.OpetationType = OpetationType;
    }

    /**
     * Get Absolute path of the directory. recursive creation is enabled by default (if the directory contains non-existent subdirectories, create the corresponding subdirectory first). 
     * @return DirectoryPath Absolute path of the directory. recursive creation is enabled by default (if the directory contains non-existent subdirectories, create the corresponding subdirectory first).
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set Absolute path of the directory. recursive creation is enabled by default (if the directory contains non-existent subdirectories, create the corresponding subdirectory first).
     * @param DirectoryPath Absolute path of the directory. recursive creation is enabled by default (if the directory contains non-existent subdirectories, create the corresponding subdirectory first).
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    /**
     * Get Permission to create directory. if not specified, it defaults to 0755. if OperationType is check, this value is meaningless. 
     * @return Mode Permission to create directory. if not specified, it defaults to 0755. if OperationType is check, this value is meaningless.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Permission to create directory. if not specified, it defaults to 0755. if OperationType is check, this value is meaningless.
     * @param Mode Permission to create directory. if not specified, it defaults to 0755. if OperationType is check, this value is meaningless.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The destination directory name for the mv operation. the path must start with /cfs/. 
     * @return DestPath The destination directory name for the mv operation. the path must start with /cfs/.
     */
    public String getDestPath() {
        return this.DestPath;
    }

    /**
     * Set The destination directory name for the mv operation. the path must start with /cfs/.
     * @param DestPath The destination directory name for the mv operation. the path must start with /cfs/.
     */
    public void setDestPath(String DestPath) {
        this.DestPath = DestPath;
    }

    public DoDirectoryOperationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoDirectoryOperationRequest(DoDirectoryOperationRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.OpetationType != null) {
            this.OpetationType = new String(source.OpetationType);
        }
        if (source.DirectoryPath != null) {
            this.DirectoryPath = new String(source.DirectoryPath);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.DestPath != null) {
            this.DestPath = new String(source.DestPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "OpetationType", this.OpetationType);
        this.setParamSimple(map, prefix + "DirectoryPath", this.DirectoryPath);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "DestPath", this.DestPath);

    }
}

