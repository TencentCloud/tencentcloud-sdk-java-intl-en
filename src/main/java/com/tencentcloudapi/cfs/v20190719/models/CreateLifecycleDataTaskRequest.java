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

public class CreateLifecycleDataTaskRequest extends AbstractModel {

    /**
    * <p>Unique file system ID.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Lifecycle task type. archive: archiving; restore: preheating; release: data release; metaload: metadata loading.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Task name.</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>Path or file to be archived. Only one path is supported and it cannot be empty.</p>
    */
    @SerializedName("TaskPath")
    @Expose
    private String TaskPath;

    /**
    * <p>Data flow ID. It can be queried through DescribeDataFlow.</p>
    */
    @SerializedName("DataFlowId")
    @Expose
    private String DataFlowId;

    /**
    * <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage. true: overwrite; false: do not overwrite (and hot storage data will not be released). If this parameter is left empty, the default value is false.</p>
    */
    @SerializedName("IsOverwrite")
    @Expose
    private Boolean IsOverwrite;

    /**
    * <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. Specify either this parameter or TaskPath.<br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
    */
    @SerializedName("ListPath")
    @Expose
    private String ListPath;

    /**
     * Get <p>Unique file system ID.</p> 
     * @return FileSystemId <p>Unique file system ID.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>Unique file system ID.</p>
     * @param FileSystemId <p>Unique file system ID.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Lifecycle task type. archive: archiving; restore: preheating; release: data release; metaload: metadata loading.</p> 
     * @return Type <p>Lifecycle task type. archive: archiving; restore: preheating; release: data release; metaload: metadata loading.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Lifecycle task type. archive: archiving; restore: preheating; release: data release; metaload: metadata loading.</p>
     * @param Type <p>Lifecycle task type. archive: archiving; restore: preheating; release: data release; metaload: metadata loading.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Task name.</p> 
     * @return TaskName <p>Task name.</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>Task name.</p>
     * @param TaskName <p>Task name.</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>Path or file to be archived. Only one path is supported and it cannot be empty.</p> 
     * @return TaskPath <p>Path or file to be archived. Only one path is supported and it cannot be empty.</p>
     */
    public String getTaskPath() {
        return this.TaskPath;
    }

    /**
     * Set <p>Path or file to be archived. Only one path is supported and it cannot be empty.</p>
     * @param TaskPath <p>Path or file to be archived. Only one path is supported and it cannot be empty.</p>
     */
    public void setTaskPath(String TaskPath) {
        this.TaskPath = TaskPath;
    }

    /**
     * Get <p>Data flow ID. It can be queried through DescribeDataFlow.</p> 
     * @return DataFlowId <p>Data flow ID. It can be queried through DescribeDataFlow.</p>
     */
    public String getDataFlowId() {
        return this.DataFlowId;
    }

    /**
     * Set <p>Data flow ID. It can be queried through DescribeDataFlow.</p>
     * @param DataFlowId <p>Data flow ID. It can be queried through DescribeDataFlow.</p>
     */
    public void setDataFlowId(String DataFlowId) {
        this.DataFlowId = DataFlowId;
    }

    /**
     * Get <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage. true: overwrite; false: do not overwrite (and hot storage data will not be released). If this parameter is left empty, the default value is false.</p> 
     * @return IsOverwrite <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage. true: overwrite; false: do not overwrite (and hot storage data will not be released). If this parameter is left empty, the default value is false.</p>
     */
    public Boolean getIsOverwrite() {
        return this.IsOverwrite;
    }

    /**
     * Set <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage. true: overwrite; false: do not overwrite (and hot storage data will not be released). If this parameter is left empty, the default value is false.</p>
     * @param IsOverwrite <p>Whether to overwrite a file in CFSTurbo if it has the same name as a file in the external storage. true: overwrite; false: do not overwrite (and hot storage data will not be released). If this parameter is left empty, the default value is false.</p>
     */
    public void setIsOverwrite(Boolean IsOverwrite) {
        this.IsOverwrite = IsOverwrite;
    }

    /**
     * Get <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. Specify either this parameter or TaskPath.<br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul> 
     * @return ListPath <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. Specify either this parameter or TaskPath.<br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
     */
    public String getListPath() {
        return this.ListPath;
    }

    /**
     * Set <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. Specify either this parameter or TaskPath.<br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
     * @param ListPath <p>Path of the data manifest file. Each line in the manifest file is the full path of a file to be processed. All paths (including the manifest file path and the paths of files to be processed in each line of the manifest file) must start with /cfs and point to existing files in the CFS file system. Specify either this parameter or TaskPath.<br>Example:</p><ul><li>If the CFS root directory / is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/lists/archive_list.txt.</li><li>If the CFS subdirectory /subdir is mounted and the manifest file is located at lists/archive_list.txt under the mount path, set this parameter to /cfs/subdir/lists/archive_list.txt.</li></ul>
     */
    public void setListPath(String ListPath) {
        this.ListPath = ListPath;
    }

    public CreateLifecycleDataTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLifecycleDataTaskRequest(CreateLifecycleDataTaskRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskPath != null) {
            this.TaskPath = new String(source.TaskPath);
        }
        if (source.DataFlowId != null) {
            this.DataFlowId = new String(source.DataFlowId);
        }
        if (source.IsOverwrite != null) {
            this.IsOverwrite = new Boolean(source.IsOverwrite);
        }
        if (source.ListPath != null) {
            this.ListPath = new String(source.ListPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskPath", this.TaskPath);
        this.setParamSimple(map, prefix + "DataFlowId", this.DataFlowId);
        this.setParamSimple(map, prefix + "IsOverwrite", this.IsOverwrite);
        this.setParamSimple(map, prefix + "ListPath", this.ListPath);

    }
}

