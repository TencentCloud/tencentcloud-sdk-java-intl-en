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
    * <p>File system ID. Currently, only Turbo file systems support this API. General-purpose file systems (including enhanced ones) do not support this API.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>create: creates a directory, equivalent to mkdir.<br>check: checks whether a directory exists, equivalent to stat.<br>move: renames a file or directory, equivalent to mv.</p>
    */
    @SerializedName("OpetationType")
    @Expose
    private String OpetationType;

    /**
    * <p>The system recursively creates all parent directories in the path by default. The path must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li><p>If the operation is create/check</p><ul><li>If the CFS root directory / is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/subdir/test1/test2</li></ul></li><li><p>If the operation is move</p><ul><li>If the CFS root directory / is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/subdir/test1/test2</li></ul></li></ul>
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
    * <p>Permission for creating the directory. If not specified, the default value is 0755. If OperationType is check, this value is meaningless.</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Target directory path for the mv operation. It must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/test3/test4</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/subdir/test3/test4</li></ul>
    */
    @SerializedName("DestPath")
    @Expose
    private String DestPath;

    /**
     * Get <p>File system ID. Currently, only Turbo file systems support this API. General-purpose file systems (including enhanced ones) do not support this API.</p> 
     * @return FileSystemId <p>File system ID. Currently, only Turbo file systems support this API. General-purpose file systems (including enhanced ones) do not support this API.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system ID. Currently, only Turbo file systems support this API. General-purpose file systems (including enhanced ones) do not support this API.</p>
     * @param FileSystemId <p>File system ID. Currently, only Turbo file systems support this API. General-purpose file systems (including enhanced ones) do not support this API.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>create: creates a directory, equivalent to mkdir.<br>check: checks whether a directory exists, equivalent to stat.<br>move: renames a file or directory, equivalent to mv.</p> 
     * @return OpetationType <p>create: creates a directory, equivalent to mkdir.<br>check: checks whether a directory exists, equivalent to stat.<br>move: renames a file or directory, equivalent to mv.</p>
     */
    public String getOpetationType() {
        return this.OpetationType;
    }

    /**
     * Set <p>create: creates a directory, equivalent to mkdir.<br>check: checks whether a directory exists, equivalent to stat.<br>move: renames a file or directory, equivalent to mv.</p>
     * @param OpetationType <p>create: creates a directory, equivalent to mkdir.<br>check: checks whether a directory exists, equivalent to stat.<br>move: renames a file or directory, equivalent to mv.</p>
     */
    public void setOpetationType(String OpetationType) {
        this.OpetationType = OpetationType;
    }

    /**
     * Get <p>The system recursively creates all parent directories in the path by default. The path must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li><p>If the operation is create/check</p><ul><li>If the CFS root directory / is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/subdir/test1/test2</li></ul></li><li><p>If the operation is move</p><ul><li>If the CFS root directory / is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/subdir/test1/test2</li></ul></li></ul> 
     * @return DirectoryPath <p>The system recursively creates all parent directories in the path by default. The path must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li><p>If the operation is create/check</p><ul><li>If the CFS root directory / is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/subdir/test1/test2</li></ul></li><li><p>If the operation is move</p><ul><li>If the CFS root directory / is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/subdir/test1/test2</li></ul></li></ul>
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set <p>The system recursively creates all parent directories in the path by default. The path must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li><p>If the operation is create/check</p><ul><li>If the CFS root directory / is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/subdir/test1/test2</li></ul></li><li><p>If the operation is move</p><ul><li>If the CFS root directory / is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/subdir/test1/test2</li></ul></li></ul>
     * @param DirectoryPath <p>The system recursively creates all parent directories in the path by default. The path must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li><p>If the operation is create/check</p><ul><li>If the CFS root directory / is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to create/check whether test1/test2 exists under the mount path, the input value is /cfs/subdir/test1/test2</li></ul></li><li><p>If the operation is move</p><ul><li>If the CFS root directory / is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/test1/test2</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under test1/test2 to DestPath, the input value is /cfs/subdir/test1/test2</li></ul></li></ul>
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    /**
     * Get <p>Permission for creating the directory. If not specified, the default value is 0755. If OperationType is check, this value is meaningless.</p> 
     * @return Mode <p>Permission for creating the directory. If not specified, the default value is 0755. If OperationType is check, this value is meaningless.</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Permission for creating the directory. If not specified, the default value is 0755. If OperationType is check, this value is meaningless.</p>
     * @param Mode <p>Permission for creating the directory. If not specified, the default value is 0755. If OperationType is check, this value is meaningless.</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Target directory path for the mv operation. It must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/test3/test4</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/subdir/test3/test4</li></ul> 
     * @return DestPath <p>Target directory path for the mv operation. It must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/test3/test4</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/subdir/test3/test4</li></ul>
     */
    public String getDestPath() {
        return this.DestPath;
    }

    /**
     * Set <p>Target directory path for the mv operation. It must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/test3/test4</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/subdir/test3/test4</li></ul>
     * @param DestPath <p>Target directory path for the mv operation. It must start with /cfs/, which represents the logical path inside the file storage instance, not the local mount point path.<br>Example:</p><ul><li>If the CFS root directory / is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/test3/test4</li><li>If the CFS subdirectory /subdir is mounted, and you need to move files under DirectoryPath to test3/test4 under the mount path, the input value is /cfs/subdir/test3/test4</li></ul>
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

