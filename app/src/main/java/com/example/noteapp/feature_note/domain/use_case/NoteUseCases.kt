package com.example.noteapp.feature_note.domain.use_case

data class NoteUseCases(
    val addNoteUseCase: AddNoteUseCase,
    val getNotesUseCase: GetNotesUseCase,
    val getNoteUseCase: GetNoteUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase
)
