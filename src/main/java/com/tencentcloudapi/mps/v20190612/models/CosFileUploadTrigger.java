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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosFileUploadTrigger extends AbstractModel {

    /**
    * Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * All supported formats are as follows:
- Video file extension. The following 15 options are supported:
`.mp4`, `.avi`, `.mov`, `.wmv`, `.flv`, `.mkv`, `.mpg`, `.mpeg`, `.rm`, `.rmvb`, `.asf`, `.3gp`, `.webm`, `.ts`, and `.m4v`.
- Audio file extension. The following 7 options are supported:
`.mp3`, `.wav`, `.aac`, `.flac`, `.ogg`, `.m4a`, and `.amr`.
- Subtitle file extension. The following 2 options are supported:
`.vtt` and `.srt`.
- `*`: any file format is supported.
- Unspecified or input an empty list: the system supports the following preset file formats: video (`.mp4`, `.ts`, `.flv`, `.wmv`, `.asf`, `.rm`, `.rmvb`, `.mpg`, `.mpeg`, `.3gp`, `.mov`, `.webm`, `.mkv`, `.avi`, and `.m4v`); audio (`.mp3`, `.m4a`, `.flac`, `.ogg`, `.wav`, `.amr`, and `.aac`); subtitle (`.vtt` and `.srt`).
**Note**:
1. If the input format list includes `*`, it indicates that any file format is supported.
2. File extensions can be provided with or without `.`, such as `.mp4` or `mp4`, both are supported.
3. Custom file extensions should consist of digits, letters, and characters, and have a length between 1 and 64 characters.
    */
    @SerializedName("Formats")
    @Expose
    private String [] Formats;

    /**
     * Get Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`. 
     * @return Bucket Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
     * @param Bucket Name of the COS bucket bound to a workflow, such as `TopRankVideo-125xxx88`.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Region of the COS bucket bound to a workflow, such as `ap-chongiqng`. 
     * @return Region Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
     * @param Region Region of the COS bucket bound to a workflow, such as `ap-chongiqng`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used. 
     * @return Dir Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
     * @param Dir Input path directory bound to a workflow, such as `/movie/201907/`. If this parameter is left empty, the `/` root directory will be used.
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get All supported formats are as follows:
- Video file extension. The following 15 options are supported:
`.mp4`, `.avi`, `.mov`, `.wmv`, `.flv`, `.mkv`, `.mpg`, `.mpeg`, `.rm`, `.rmvb`, `.asf`, `.3gp`, `.webm`, `.ts`, and `.m4v`.
- Audio file extension. The following 7 options are supported:
`.mp3`, `.wav`, `.aac`, `.flac`, `.ogg`, `.m4a`, and `.amr`.
- Subtitle file extension. The following 2 options are supported:
`.vtt` and `.srt`.
- `*`: any file format is supported.
- Unspecified or input an empty list: the system supports the following preset file formats: video (`.mp4`, `.ts`, `.flv`, `.wmv`, `.asf`, `.rm`, `.rmvb`, `.mpg`, `.mpeg`, `.3gp`, `.mov`, `.webm`, `.mkv`, `.avi`, and `.m4v`); audio (`.mp3`, `.m4a`, `.flac`, `.ogg`, `.wav`, `.amr`, and `.aac`); subtitle (`.vtt` and `.srt`).
**Note**:
1. If the input format list includes `*`, it indicates that any file format is supported.
2. File extensions can be provided with or without `.`, such as `.mp4` or `mp4`, both are supported.
3. Custom file extensions should consist of digits, letters, and characters, and have a length between 1 and 64 characters. 
     * @return Formats All supported formats are as follows:
- Video file extension. The following 15 options are supported:
`.mp4`, `.avi`, `.mov`, `.wmv`, `.flv`, `.mkv`, `.mpg`, `.mpeg`, `.rm`, `.rmvb`, `.asf`, `.3gp`, `.webm`, `.ts`, and `.m4v`.
- Audio file extension. The following 7 options are supported:
`.mp3`, `.wav`, `.aac`, `.flac`, `.ogg`, `.m4a`, and `.amr`.
- Subtitle file extension. The following 2 options are supported:
`.vtt` and `.srt`.
- `*`: any file format is supported.
- Unspecified or input an empty list: the system supports the following preset file formats: video (`.mp4`, `.ts`, `.flv`, `.wmv`, `.asf`, `.rm`, `.rmvb`, `.mpg`, `.mpeg`, `.3gp`, `.mov`, `.webm`, `.mkv`, `.avi`, and `.m4v`); audio (`.mp3`, `.m4a`, `.flac`, `.ogg`, `.wav`, `.amr`, and `.aac`); subtitle (`.vtt` and `.srt`).
**Note**:
1. If the input format list includes `*`, it indicates that any file format is supported.
2. File extensions can be provided with or without `.`, such as `.mp4` or `mp4`, both are supported.
3. Custom file extensions should consist of digits, letters, and characters, and have a length between 1 and 64 characters.
     */
    public String [] getFormats() {
        return this.Formats;
    }

    /**
     * Set All supported formats are as follows:
- Video file extension. The following 15 options are supported:
`.mp4`, `.avi`, `.mov`, `.wmv`, `.flv`, `.mkv`, `.mpg`, `.mpeg`, `.rm`, `.rmvb`, `.asf`, `.3gp`, `.webm`, `.ts`, and `.m4v`.
- Audio file extension. The following 7 options are supported:
`.mp3`, `.wav`, `.aac`, `.flac`, `.ogg`, `.m4a`, and `.amr`.
- Subtitle file extension. The following 2 options are supported:
`.vtt` and `.srt`.
- `*`: any file format is supported.
- Unspecified or input an empty list: the system supports the following preset file formats: video (`.mp4`, `.ts`, `.flv`, `.wmv`, `.asf`, `.rm`, `.rmvb`, `.mpg`, `.mpeg`, `.3gp`, `.mov`, `.webm`, `.mkv`, `.avi`, and `.m4v`); audio (`.mp3`, `.m4a`, `.flac`, `.ogg`, `.wav`, `.amr`, and `.aac`); subtitle (`.vtt` and `.srt`).
**Note**:
1. If the input format list includes `*`, it indicates that any file format is supported.
2. File extensions can be provided with or without `.`, such as `.mp4` or `mp4`, both are supported.
3. Custom file extensions should consist of digits, letters, and characters, and have a length between 1 and 64 characters.
     * @param Formats All supported formats are as follows:
- Video file extension. The following 15 options are supported:
`.mp4`, `.avi`, `.mov`, `.wmv`, `.flv`, `.mkv`, `.mpg`, `.mpeg`, `.rm`, `.rmvb`, `.asf`, `.3gp`, `.webm`, `.ts`, and `.m4v`.
- Audio file extension. The following 7 options are supported:
`.mp3`, `.wav`, `.aac`, `.flac`, `.ogg`, `.m4a`, and `.amr`.
- Subtitle file extension. The following 2 options are supported:
`.vtt` and `.srt`.
- `*`: any file format is supported.
- Unspecified or input an empty list: the system supports the following preset file formats: video (`.mp4`, `.ts`, `.flv`, `.wmv`, `.asf`, `.rm`, `.rmvb`, `.mpg`, `.mpeg`, `.3gp`, `.mov`, `.webm`, `.mkv`, `.avi`, and `.m4v`); audio (`.mp3`, `.m4a`, `.flac`, `.ogg`, `.wav`, `.amr`, and `.aac`); subtitle (`.vtt` and `.srt`).
**Note**:
1. If the input format list includes `*`, it indicates that any file format is supported.
2. File extensions can be provided with or without `.`, such as `.mp4` or `mp4`, both are supported.
3. Custom file extensions should consist of digits, letters, and characters, and have a length between 1 and 64 characters.
     */
    public void setFormats(String [] Formats) {
        this.Formats = Formats;
    }

    public CosFileUploadTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosFileUploadTrigger(CosFileUploadTrigger source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
        if (source.Formats != null) {
            this.Formats = new String[source.Formats.length];
            for (int i = 0; i < source.Formats.length; i++) {
                this.Formats[i] = new String(source.Formats[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Dir", this.Dir);
        this.setParamArraySimple(map, prefix + "Formats.", this.Formats);

    }
}

