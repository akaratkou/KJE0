package com.ms.intro.mapper;

import com.ms.intro.domain.SongData;
import com.ms.intro.dto.SongDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-15T04:54:28+0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 21.0.1 (Oracle Corporation)"
)
public class SongDtoToDomainMapperImpl implements SongDtoToDomainMapper {

    @Override
    public SongData songToCarDto(SongDto dto) {
        if ( dto == null ) {
            return null;
        }

        SongData songData = new SongData();

        songData.setId( dto.getId() );
        songData.setName( dto.getName() );
        songData.setArtist( dto.getArtist() );
        songData.setAlbum( dto.getAlbum() );
        songData.setLength( dto.getLength() );
        songData.setResourceId( dto.getResourceId() );
        songData.setYear( dto.getYear() );

        return songData;
    }

    @Override
    public SongDto songToCarDto(SongData dto) {
        if ( dto == null ) {
            return null;
        }

        SongDto songDto = new SongDto();

        songDto.setId( dto.getId() );
        songDto.setName( dto.getName() );
        songDto.setArtist( dto.getArtist() );
        songDto.setAlbum( dto.getAlbum() );
        songDto.setLength( dto.getLength() );
        songDto.setResourceId( dto.getResourceId() );
        songDto.setYear( dto.getYear() );

        return songDto;
    }
}
