package com.mpc.data.yelputil.model;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("archive")
public class ArchiveFile {
	private List<ArchiveFileProperties> files;

	public static class ArchiveFileProperties {
		private String path;
	}

}
